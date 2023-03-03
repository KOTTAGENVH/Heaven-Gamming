package com.heaven1;



import java.io.IOException;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class FMservelet
*/
public class FMservelet extends HttpServlet {
private static final long serialVersionUID = 1L;



/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String Username = request.getParameter("id");

List <Financialmanager> fmData = FinancialmanagerDBUtil.getFinancialmanager(Username);



request.setAttribute("fmData",fmData); //list object

//move to retrieve purchases jsp page

RequestDispatcher rs = request.getRequestDispatcher("FinancialManageracc.jsp");
rs.forward(request, response);



}




}