/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.ejb.TravelDataEJBRemote;
import quiz.entities.Travel;

/**
 *
 * @author ipd
 */
public class AddTravelServlet extends HttpServlet {

    @EJB
    TravelDataEJBRemote travelService;

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
          try{
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddTravelServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddTravelServlet at " + request.getContextPath() + "</h1>");

            if (request.getMethod().toLowerCase().equals("get")) {
                out.println("<form method=\"POST\">");

                out.println("Name: <input type=\"text\" name=\"fullname\" ><br>");
                out.println("Destination: <input type=\"text\" name=\"destination\" ><br>");
                out.println("Departure date: <input type=\"date\" name=\"DepDate\" ><br>");
                out.println("Return date: <input type=\"date\" name=\"ReDate\" ><br>");
                out.println("<input type=\"submit\" value=\"Add travel\">");
                out.println("</form>");

            } else {
                String fullname = request.getParameter("fullname");
                String destination = request.getParameter("destination");
                String departureDateStr = request.getParameter("DepDate");
                Date departureDate = new SimpleDateFormat("yyyy-MM-dd").parse(departureDateStr);
                String ReturnDateStr = request.getParameter("ReDate");
                Date returnDate = new SimpleDateFormat("yyyy-MM-dd").parse(ReturnDateStr);
                Travel item = new Travel(fullname, destination, departureDate, returnDate);
                travelService.addTravel(item);
                out.println("<p>travel addedd successfully</p>");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Exception occured: " + e.getMessage());
        }

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

}
