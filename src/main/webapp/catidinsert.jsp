<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
   <meta charset="ISO-8859-1">
  <title>heaven</title>
  <link rel = "stylesheet" href="CSS/FinancialManager.css"> <!-- Linking all css files -->
  <link rel="stylesheet" href="CSS/header.css">
    <link rel="stylesheet" href="CSS/Footer.css">
  <!-- link to the body css file  -->
  <link rel = " shortcut icon " href = "CSS/Pictures/logo.jpeg">
  <script> alert("Category ID insert page is loaded ") </script>
    </head>
<body>
<header> <!-- Start of header file -->
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
   <form action="insertcid" method="post">   <!-- fORM TO INSERT CATEGORY ID -->
   Cat id<input type = "text" name="catId"><br> 
   
   <input type="submit" name="submit" value = "Insert Category ID">
   </form>
   <footer> <!-- Start of footer -->
        <h1>Heaven</h1>
            <div class= "footMain">
            <div class = "leftFoot">
            <img src="CSS/Pictures/logo.jpeg" alt="image" width=210px height='90px' draggable="false" class = 'mainImg'>
            <p> Heaven is the best platform <br> to for your online games.<br><h3>contact us</h3>0171 74 12 132<br>0112 555 5555<br>heaven@x.com</p>
            </div>
            <div class = "rightFoot">
            <img src="CSS/Pictures/adminImg.png" alt="image" width=470px height='400px' draggable="false">
            </div>
            </div>
   </footer>
</body>
</html>