package com.staffsalaries;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Staff salary insert servlet
@WebServlet("/Staffsalariesinsert")
public class Staffsalariesinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String role = request.getParameter("role");     //Assign all the getparameters to variables
		String month = request.getParameter("month");
		String payment = request.getParameter("payment");
		System.out.println(id+role+month+payment);
		boolean isTrue;
		
		
		isTrue = StaffsalaryDBUtil.inserstaffsalaries(id,role,month,payment); //isTrue boolean attribute used to check if data is inserted to the database
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		    dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
		    dis2.forward(request, response);	
		}
		
	}

}
