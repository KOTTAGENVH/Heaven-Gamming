package com.heaven1;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;






@WebServlet("/LoginServlet")
public class loginservelet extends HttpServlet {
private static final long serialVersionUID = 1L;
private static Connection con =null;
private static Statement stmt = null;



protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



PrintWriter out = response.getWriter();
response.setContentType("text/html");

String userName = request.getParameter("username");
String password = request.getParameter("password");
HttpSession session = request.getSession();
RequestDispatcher dispatcher = null;

boolean isTrue;

try {
Class.forName("com.mysql.jdbc.Driver");
con = DBConnect.getConnection();
stmt = con.createStatement();

PreparedStatement pst =con.prepareStatement("select * from financialmanager where username= ? and password= ?");
pst.setString(1,userName);
pst.setString(2, password);

ResultSet rs = pst.executeQuery();


if(rs.next()) {
session.setAttribute("username", rs.getString(2));
session.setAttribute("id", rs.getInt(1));
System.out.println(rs.getString(2));
response.sendRedirect("FinancialManageracc.jsp");
dispatcher = request.getRequestDispatcher("FinancialManageracc.jsp");
}else {
out.println("<scrpt type = 'text/javascript'>");
out.println("alert('Your username or password is incorrect');");
out.println("location='login.jsp'");
out.println("</script0>");
}
}
catch(Exception e) {
e.printStackTrace();
}
}
}