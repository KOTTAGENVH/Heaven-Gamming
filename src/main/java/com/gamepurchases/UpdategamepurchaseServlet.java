package com.gamepurchases;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdategamepurchaseServlet
 */
@WebServlet("/UpdategamepurchaseServlet")
public class UpdategamepurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int uid = Integer.parseInt(request.getParameter("userId")); 
	int giD = Integer.parseInt(request.getParameter("gid"));
	String PurDate = request.getParameter("purDate");
	boolean isTrue;
	
	isTrue = RetrievegamepurchasesDBUtil.updategamestatus( uid,giD); //assign boolean variable to check whether if data is retrieved
	
	if(isTrue == true) {
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request,response);
	}
	else {
		RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
		dis.forward(request,response);
	}
	}

}
