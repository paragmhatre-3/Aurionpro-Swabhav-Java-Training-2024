<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="PARAG"></c:out>
<c:set var="name" value="Parag" scope="session" ></c:set>
<c:out value="${name}"></c:out>
<c:set var="number1" value="33" ></c:set>
<c:if test="${number1%2 != 0}">
<h1>ODD</h1>
</c:if>

<c:import var="data" url="file:///C:/Users/parag.mhatre/Desktop/bootstrap_tutorial/actual_index.html"/>  
<c:out value="${data}"/>
</body>
</html>