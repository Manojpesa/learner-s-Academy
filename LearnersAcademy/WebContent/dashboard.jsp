<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0);

if(session.getAttribute("USERNAME") == null || session.getAttribute("PASSWORD") == null  )
{
	response.sendRedirect("index.jsp");	
}
%>

<a href='teacherslist'>Teachers List</a><br>
<a href='reportcard'>Class List/Report Card</a><br><br>

<form method="GET" action="logout">
			<input type="submit" value="Logout">
		</form>

</body>
</html>