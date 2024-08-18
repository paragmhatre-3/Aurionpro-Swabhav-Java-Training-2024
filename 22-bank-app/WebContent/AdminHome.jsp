<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Admin Home</title>  
<!-- Bootstrap CSS -->  
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">  
</head>  
<body>  
<div class="container mt-5">  
    <div class="row justify-content-between"> 
        <div class="col-md-6">  
            <h4>Welcome to Admin Home</h4> 
        </div> 
        <div class="col-md-2 text-end">  
            <form action="LogoutServlet" method="post" style="display:inline;"> 
                <button type="submit" class="btn btn-danger">Logout</button> 
            </form> 
        </div> 
    </div> 
    <div class="card mt-3">  
        <div class="card-body">  
            <!-- Display error message if it exists -->
                        <c:if test="${not empty errorMessage}">
                            <div class="alert alert-danger">${errorMessage}</div>
                        </c:if>
                <!-- Display success message if it exists -->
                        <c:if test="${not empty successMessage}">
                            <div class="alert alert-success">${successMessage}</div>
                        </c:if>
                    <form action="AdminHomeController"> 
                        <div class="d-grid gap-2 mb-3"> 
                            <button type="submit" class="btn btn-primary" name="action" value="AddNewCustomer">Add New Customer</button> 
                        </div> 
                        <div class="d-grid gap-2 mb-3"> 
                            <button type="submit" class="btn btn-primary" name="action" value="AddNewAccount">Add New Account</button> 
                        </div> 
                        <div class="d-grid gap-2 mb-3"> 
                            <button type="submit" class="btn btn-primary" name="action" value="ViewCustomers">View Customers</button> 
                        </div> 
                        <div class="d-grid gap-2"> 
                            <button type="submit" class="btn btn-primary" name="action" value="ViewTransactions">View Transactions</button> 
                        </div> 
                    </form> 
        </div>  
    </div>  
</div>  
<!-- Bootstrap JS (Optional) -->  
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>  
</body>  
</html>