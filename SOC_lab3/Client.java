package com.cli;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Client extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            float a,b;
            a=Float.parseFloat(request.getParameter("num1"));
            b=Float.parseFloat(request.getParameter("num2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Client</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Addition of "+a+" & "+b+" is: " + Addition(a,b) + "</h1>");
            out.println("<h1>Subtraction of "+a+" & "+b+" is: " + Substraction(a,b) + "</h1>");
            out.println("<h1>Multiplication of "+a+" & "+b+" is: " + Multiplication(a,b) + "</h1>");
            out.println("<h1>Division of "+a+" & "+b+" is: " + Division(a,b) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private String Addition(float a, float b)
    {
        com.cli.CalculatorService port = service.getMyServerPort();
        return port.Addition(a,b);
    }
    
    private String Substraction(float a, float b)
    {
        com.cli.CalculatorService port = service.getMyServerPort();
        return port.Addition(a,b);
    }
    
    private String Multiplication(float a, float b)
    {
        com.cli.CalculatorService port = service.getMyServerPort();
        return port.Addition(a,b);
    }
    
    private String Division(float a, float b)
    {
        com.cli.CalculatorService port = service.getMyServerPort();
        return port.Addition(a,b);
    }

}
