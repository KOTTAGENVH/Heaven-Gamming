<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %> <!-- Imported jstl tag library -->

<!DOCTYPE html>
<html>
 
 <head>
  
  <meta charset="ISO-8859-1">
  <title>heaven</title>
  <link rel = "stylesheet" href="CSS/rgp.css">
  <link rel="stylesheet" href="CSS/header.css">
    <link rel="stylesheet" href="CSS/Footer.css">
  <link rel = " shortcut icon " href = "pictures/logo.jpeg">
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
  
    
  <form action="rgpData" method="post">
  <Input type = "submit" Value = "Check game purchases">
   </form>
	
  <h1>!Welcome!</h1><br>
  <h1>Game purchases</h1><br>
  <table class="center">

  <c:forEach var="data" items="${rgpData }">
  
   <!-- Assign variables for the data retrieved by the database -->
 
   <c:set var="userid" value="${data.userId}"/>
    <c:set var="gid" value="${data.gid}"/>
     <c:set var="status" value="${data.status}"/>
      <c:set var="purDate" value="${data.purDate}"/>
    
     <!--Retrieval of Details from the database -->
    
    <tr>
		<td>User ID</td>                  
		<td>${data.userId}</td>     <!-- Showing output in the table -->
	</tr>
		<tr>
		<td>Game ID</td>
		<td>${data.gid}</td>
	</tr>
	<tr>
		<td>Status</td>
		<td>${data.status}</td>
	</tr>
	<tr>
	   <td>Purchase Date</td>
	   <td>${data.purDate }</td>
 </c:forEach>
	</table>
	
	<c:url value="Updategamepurchase.jsp" var="statusupdate">   <!-- Linked to Updategamepurchase.jsp through value -->
	   <c:param name = "userid" value="${userid}"/>
	   <c:param name = "gid" value="${gid}"/>
	   <c:param name = "status" value="${status}"/>              <!-- Data which need to bee taken with when moving to Updategamepurchase.jsp -->
	   <c:param name = "purchaseddate" value="${purDate}"/>
	</c:url>
	
	<!-- Creating and linking the button to  updategamepurchase.jsp thru statusupdate -->
	
	<a href= "${statusupdate}"> 
	<input type="button" name="update" value="Update Status">
    </a>
 
 
   

  </body>
 
</html>