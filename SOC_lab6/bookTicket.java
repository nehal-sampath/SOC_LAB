import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MovieService {

    private List<Movie> movies = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private int bookingId = 1;

    @WebMethod
    public List<Movie> getMovies() {
        return movies;
    }

   @WebMethod
    public String bookTicket(int movieId, int numTickets) {
    // Check if the movie exists
    Movie movie = null;
    for (Movie m : movies) {
        if (m.getId() == movieId) {
            movie = m;
            break;
        }
    }

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
