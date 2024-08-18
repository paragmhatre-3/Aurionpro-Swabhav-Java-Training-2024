<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Admin: New Transaction</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body> 
<div class="container mt-5"> 
    <div class="row justify-content-center"> 
        <div class="col-md-6"> 
            <div class="card"> 
                <div class="card-header text-center"> 
                    <h4>New Customer</h4> 
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
        
                    <form action="AdminHomeController" method="post"> 
                        <input type="hidden" name="action" value="AddCustomer2"></input> 
 
                        <div class="mb-3"> 
                            <label for="firstname" class="form-label">Customer First Name</label> 
                            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter first name"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="lastname" class="form-label">Customer Last Name</label> 
                            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter last name"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="email" class="form-label">Email ID</label> 
                            <input type="email" class="form-control" id="email" name="email" placeholder="Enter email ID"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="password" class="form-label">Password</label> 
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter password"> 
                        </div> 
 
                        <div class="d-grid gap-2"> 
                            <button type="submit" class="btn btn-primary" name="action" value="Submit">Submit</button> 
                            <button type="submit" class="btn btn-secondary" name="action" value="Cancel">Cancel</button> 
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