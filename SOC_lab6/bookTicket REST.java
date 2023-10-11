import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MovieBookingApplication {

    // Initialize lists to store movie and booking data
    private List<Movie> movies = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private int bookingId = 1;

    public static void main(String[] args) {
        SpringApplication.run(MovieBookingApplication.class, args);
    }

    // Define a RESTful endpoint to retrieve a list of movies
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }

    // Define a RESTful endpoint to book movie tickets
    @PostMapping("/bookings")
    public String bookTicket(@RequestBody BookingRequest bookingRequest) {
        int movieId = bookingRequest.getMovieId();
        int numTickets = bookingRequest.getNumTickets();

        // Check if the movie exists
        Movie movie = movies.stream().filter(m -> m.getId() == movieId).findFirst().orElse(null);

        if (movie != null) {
            synchronized (movie) { // Ensure thread safety for seat availability
                int availableSeats = movie.getSeatsAvailable();
                if (availableSeats >= numTickets) {
                    // Create a booking
                    Booking booking = new Booking(bookingId++, movieId, numTickets);
                    bookings.add(booking);

                    // Update available seats
                    movie.setSeatsAvailable(availableSeats - numTickets);

                    return "Booking successful";
                } else {
                    return "Booking failed: Not enough seats available";
                }
            }
        } else {
            return "Booking failed: Movie not found";
        }
    }
}
