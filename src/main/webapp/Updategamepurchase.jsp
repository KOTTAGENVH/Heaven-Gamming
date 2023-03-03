<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
 <html>
  <head>
   <meta charset="ISO-8859-1">
   <title>heaven</title>
   <link rel = "stylesheet" href="CSS/rgp.css">
   <link rel="stylesheet" href="CSS/header.css">
   <link rel = " shortcut icon " href = "CSS/pictures/logo.jpeg">
   <script> alert("Retrieve Staff salaries page is loaded ") </script>
 </head>
 <body>
  <header>           <!-- Header -->
                             
        <img class="logo" src="CSS/Pictures/logo.jpeg" alt="heaven" width=200px height='100px' draggable="false">
        <nav>
          <ul class="navBarLinks">
            <li><a href="FinancialManageracc.jsp">Home</a></li>
            <li><a href="Retrievegamepurchases.jsp">GamePurchases</a></li>
            <li><a href="Staffsalarires.jsp">Staff-Salaries</a></li>
          </ul>
        </nav>
        <button>
          <a href="login.jsp">Login</a>
        </button>
    
    </header>
  
   <!-- Get data and assign to these variables -->
    <%
       int Userid = Integer.parseInt(request.getParameter("userid"));
       int gid =Integer.parseInt(request.getParameter("gid"));
       int status=Integer.parseInt(request.getParameter("status"));
       String Purchasedate=request.getParameter("purchaseddate");    
    %>
  
     <!-- Form to display data or take input -->
   <form action="update" method="post">
    UserId <input type="text" name="userId" value="<%= Userid%>"><br>
    Gid<input type="text" name="gid" value="<%= gid%>"><br>
    PurchaseDate<input type="text" name="purDate" value="<%= Purchasedate%>"><br>
    <input type = "submit" name = "submit" value="Approve"><br>
   </form>
   
   <footer> <!-- Start of Footer -->
    Copyright @heaven
   </footer>
 
 </body>
 </html>