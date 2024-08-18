<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Login Page</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
 
<!-- Custom CSS --> 
<style> 
    body { 
        background-image: url('login.jpg');
        background-size: cover; 
        background-repeat: no-repeat; 
        background-position: center; 
        height: 100vh; 
        margin: 0; 
        padding: 0; 
        display: flex; 
        align-items: center; 
        justify-content: center; 
    } 
 
    .card { 
        background-color: rgba(255, 255, 255, 0.8); /* Slightly transparent background for the card */ 
        border-radius: 10px; 
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); 
    } 
</style> 
</head> 
<body> 
<div class="container"> 
    <div class="row justify-content-center"> 
        <div class="col-md-6"> 
            <div class="card"> 
                <div class="card-header text-center"> 
                    <h4> Bank Of Bihar - Login</h4> 
                </div> 
                <div class="card-body"> 
                <!-- Display error message if it exists -->
                        <c:if test="${not empty errorMessage}">
                            <div class="alert alert-danger">${errorMessage}</div>
                        </c:if>
                <!-- Display success message if it exists -->
                        <c:if test="${not empty successMessage}">
                            <div class="alert alert-success">${successMessage}</div>
                        </c:if>
                    <form action="BankLoginController" method="post"> 
                        <div class="mb-3"> 
                            <label for="username" class="form-label">Username</label> 
                            <input type="text" class="form-control" id="username" name="username" required> 
                        </div> 
                        <div class="mb-3"> 
                            <label for="password" class="form-label">Password</label> 
                            <input type="password" class="form-control" id="password" name="password" required> 
                        </div> 
                        <div class="d-grid gap-2"> 
                            <button type="submit" class="btn btn-primary" name="action" value="AdminLogin">Admin Login</button> 
                            <button type="submit" class="btn btn-success" name="action" value="CustomerLogin">Customer Login</button> 
                        </div> 
                    </form> 
                </div> 
            </div> 
        </div> 
    </div> 
</div> 
<!-- Bootstrap JS (Optional) --> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script> 
</body> 
</html>