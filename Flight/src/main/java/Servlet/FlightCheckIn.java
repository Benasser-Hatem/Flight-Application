package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.FlightBooking;


@WebServlet("/FlightCheckIn")
public class FlightCheckIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FlightCheckIn() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	        String idFlight = request.getParameter("id_fli");
	        		      FlightBooking voyageurs = new FlightBooking();	 
	        		      voyageurs.setId(idFlight);
	        		      voyageurs.isBusiness();
	        		      request.setAttribute("voyageurs", voyageurs);
	        		      if (voyageurs.isBusiness()==true) {
		      response.sendRedirect("CheckInBusiness.jsp");
	        		      }
	        		      else {
	        		    	  response.sendRedirect("CheckInEconomy.jsp");  
	        		      }
		      doGet(request, response);
	}

}
