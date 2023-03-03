package com.heaven1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CatidinsertServlet
 */
@WebServlet("/CatidinsertServlet")
public class CatidinsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		int ID = (int)session.getAttribute("id");
		String Catid =request.getParameter("catId");
	
		int cat =Integer.parseInt(Catid);
		boolean isTrue;
		
	   isTrue = CatidDBUtil.insertCatid(ID,cat);
	   
	   if(isTrue == true) {
		   RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		   dis.forward(request, response);
	   }else {
		   RequestDispatcher dis2 = request.getRequestDispatcher("unsucess.jsp");
		   dis2.forward(request, response);
	   }
	}

}
