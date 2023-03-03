 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>

  <!DOCTYPE html>
  <html>

  <head>
   <meta charset="ISO-8859-1">
    <title>heaven</title>
    <link rel = "stylesheet" href="CSS/FinancialManager.css"> <!-- linking all css files -->
    <link rel="stylesheet" href="CSS/header.css">
    <link rel="stylesheet" href="CSS/Footer.css">
    <!-- link to the body css file -->
    <link rel = " shortcut icon " href = "CSS/Pictures/logo.jpeg">
    <script> alert("Financial manager account is loaded ") </script>
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
  <%String name =(String)session.getAttribute("username"); %>
  <form action="show" method="post">
   <input type="text" value="<%=name%>" name="id">
   <input type= "submit" value = "checkAcctype"> <!-- The submit button which triggers to show --> 
  </form>

 <h1>Welcome!</h1><br>
 <h1>Financial Manager Profile</h1><br> <!-- Manager profile data printed retrieved from database -->

   <table class="center">
   <c:forEach var="data1" items="${fmData}">

  <tr>
  <td>FM ID</td>
  <td>${data1.id}</td>
 </tr>
 <tr>
  <td>FM Email</td>
  <td>${data1.userName}</td>
 </tr>
 <tr>
  <td>FM User Name</td>
  <td>${data1.email}</td>
 </tr>
 
 </c:forEach>
 </table>

 <h2>Current catgory list</h2>
 <form action="toCheck" method="post"> <!-- Printing data retrieved from categorylist database -->
  <input type= "submit" value = "checkAcc">
 </form>

 <table class="center">
 <c:forEach var="data" items="${catData}">

 <c:set var="id" value="${data.catId}"/>
 <tr>
  <td>Category Id</td>
  <td>${data.catId}</td>
 </tr>

 </c:forEach>
 </table> 

 <br><br><br>
 <div class="option">
 <table>
 <tr>
  <td><p>Category..1</p></td> <!-- Financial manager can access the relevant category from this link -->
 <tr>
  <td><a href="Retrievegamepurchases.jsp">Game-Purchases</a></td>
 </tr>
 <tr>
  <td><p>Category..2</p></td>
 </tr>
 <tr>
  <td><a href="RetrieveStaffsalaries.jsp">Staff-Salaries</a></td>
 </tr>
 </table>
 </div>

 <br><br><br>

 <button>
  <a href="catidinsert.jsp">Insert category</a></td> <!-- Insert category id button -->
 </button>
 <c:url value="DeletecatId.jsp" var="catdelete">
 <c:param name="id" value="${id}"></c:param>
 </c:url>
 <a href="${catdelete}">
  <input type="button" name="delete" value="Deletecatid" > <!-- Delete category id button -->
 </a>

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