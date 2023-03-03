package com.staffsalaries;
//Stafsalary servlet
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Staffsalaryservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Staffsalary> ssData = StaffsalaryDBUtil.getStaffsalary();
		
		request.setAttribute("ssData", ssData); //list object
		
		RequestDispatcher ss = request.getRequestDispatcher("RetrieveStaffsalaries.jsp"); 
		ss.forward(request,  response); //move to retrieve purchases jsp page
	}

}
