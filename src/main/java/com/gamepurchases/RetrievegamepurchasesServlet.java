package com.gamepurchases;

import java.io.IOException;
import java.util.Date;        //import jar files
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrievegamepurchasesServlet
 */
@WebServlet("/RetrievegamepurchasesServlet")
public class RetrievegamepurchasesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Retrievegamepurchases> rgpData = RetrievegamepurchasesDBUtil.getRetrievegamepurchasesDetails(); //retrieve list
		
	
		request.setAttribute("rgpData",rgpData); //list object
		
		RequestDispatcher rs = request.getRequestDispatcher("Retrievegamepurchases.jsp"); //move to retrieve purchases jsp page
		rs.forward(request, response);

	}

}
