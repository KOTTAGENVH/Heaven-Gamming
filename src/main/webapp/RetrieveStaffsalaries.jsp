<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE html>
 <html>
 <head>
  <meta charset="ISO-8859-1">
  <link rel = "stylesheet" href="CSS/Staffsalaries.css"> <!-- Linking all css -->
  <link rel="stylesheet" href="CSS/header.css">
  <title>heaven</title>
  <link rel = " shortcut icon " href = "CSS/pictures/logo.jpeg">
  <script> alert("Retrieve Staff salaries page is loaded ") </script>
 </head>
 
 <body> 
  <header> <!-- Header file -->
   <img class="logo" src="Pictures/logo.jpeg" alt="heaven" width=200px height='100px' draggable="false">
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
  <form action="submit" method="post">
   <input type="submit" value="retrieve salaries">  <!-- Button to retriev all staff salaries data -->
  </form>
	
  <h1>Staff salaries</h1><br>
  <table class="center">

  <c:forEach var="data" items="${ssData }">   <!-- Table which shows all staff slaries data -->
    <tr>
		<td>SS ID</td>
		<td>${data.id}</td>
	</tr>
		<tr>
		<td>SS Role</td>
		<td>${data.role}</td>
	</tr>
	<tr>
		<td>SS Month</td>
		<td>${data.month}</td>
	</tr>
	
	<tr>
		<td>SS Payment</td>
		<td>${data.payment}</td>
	</tr>

  </c:forEach> 
  </table>
 
  <br><br>

   <br> <br> <br>
   <div class="btn-group">
   <a href = "Staffsalaries.jsp" class = "button"> Insert Staff salaries</a>
   
        </div>
         
    <footer> <!-- Start of Footer -->
    Copyright @heaven
    </footer>
 </body>
 </html>