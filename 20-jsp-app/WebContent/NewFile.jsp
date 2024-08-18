<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import= "java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Scriplet Tag -->
	<b> <%
	out.print(new java.util.Date());
	%>
	</b>

	<!-- Expression Tag -->
	<h1>
	<%=
	new Date()
	%>
	</h1>

	<!-- Declaration Tag -->
	<b> <%!String name = "Parag";%>
	</b>

	Welcome
	<h2><%= name %></h2>
	<%@include file= "insert.jsp" %>
	
	<h1>
	<%=
	config.getServletName()
	%>
	</h1>
	
	<h1>
	<%=
	config.getServletContext()
	%>
	</h1>
	
	
</body>
</html>