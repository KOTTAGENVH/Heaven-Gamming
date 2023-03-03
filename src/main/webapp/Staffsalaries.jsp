<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
  <html>
   <head>
   <meta charset="ISO-8859-1">
   <link rel = "stylesheet" href="CSS/Staffsalaries.css">  <!-- Linking css pages -->
   <link rel="stylesheet" href="CSS/header.css">
   <title>heaven</title>
   <link rel = " shortcut icon " href = "CSS/Pictures/logo.jpeg">
   <script> alert("Insert Staff salaries page is loaded ") </script>
   
   <script>                            //Opening javascript tag for frontend vlidation validation
     function validateForm() {
     var x = document.forms["Stfsalinsrt"]["id"].value;
     if (x == "" || x == null) {
     alert("id must be filled out");
     return false;
   }
 }
  </script>
  </head>
  <body>
  <header>   <!-- Start of header -->

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

  <h1>!WELCOME!</h1><br><br>
  <h2>Insert staff salaries</h2><br><br>
 
  <form name = "Stfsalinsrt" action="insert" method ="post" onsubmit="return validateForm()"> <!-- Form to take user input -->
    ID <input type="text"  name ="id"><br><br>
    ROLE <input type="text" name="role"><br><br>
    MONTH <input type="text" name="month"><br><br>
    PAYMENT <input type="text" name="payment"><br><br>
    <input type="submit" name="insert" value="Create_staffsalary">    <!-- Submit -->
  </form>
     <br> <br> <br>

      <a href = "FinancialManageracc.jsp" class = "button"> 
      <input type="button" name="update" value="Return to profile">
     </a>
    
    <footer> <!-- Start of Footer -->
    Copyright @heaven
    </footer>
 </body>
 </html>