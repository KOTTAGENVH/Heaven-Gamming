package com.heaven1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
   

public class Catidservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		int ID = (int)session.getAttribute("id");
		List <Catid> catData = CatidDBUtil.getCatidDetails(ID);
		request.setAttribute("catData",catData); //list object
		
		//move to retrieve purchases jsp page
		
		RequestDispatcher rs = request.getRequestDispatcher("FinancialManageracc.jsp");
		rs.forward(request, response);
		
		

	}
	

	
}
