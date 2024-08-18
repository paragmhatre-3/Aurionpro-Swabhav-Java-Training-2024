<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Add New Account</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body> 
<div class="container mt-5"> 
    <div class="row justify-content-center"> 
        <div class="col-md-6"> 
            <div class="card"> 
                <div class="card-header text-center"> 
                    <h4>Add New Account</h4> 
                </div> 
                <div class="card-body"> 
                    <form action="AdminHomeController" method="post"> 
                        <input type="hidden" name="action" value="AddAccount2"></input> 
 
                        <div class="mb-3"> 
                            <label for="customerid" class="form-label">Customer ID</label> 
                            <input type="text" class="form-control" id="customerid" name="customerid" placeholder="Enter Customer ID">
                            <input type="number" class="form-control" id="balance" name="balance" placeholder="Enter Initial Balance" step="1" min="0">
                        </div> 
 
                        <div class="d-grid gap-2"> 
                            <button type="submit" class="btn btn-primary" name="action" value="Submit">Submit</button> 
                        </div> 
                    </form> 
                </div> 
            </div> 
        </div> 
    </div> 
     
    <!-- Displaying Customers --> 
    <div class="row justify-content-center mt-4"> 
        <div class="col-md-6"> 
            <% String customerDetails = (String) request.getAttribute("customerDetails");  
               if(customerDetails != null) { %> 
                <div class="alert alert-info" role="alert"> 
                    <h5>Customer Details:</h5> 
                    <p><%= customerDetails %></p> 
                </div> 
            <% } %> 
        </div> 
    </div> 
 
    <div class="row justify-content-center mt-3"> 
        <div class="col-md-6"> 
            <form action="AdminHomeController" method="POST"> 
                <input type="hidden" name="customerId" value="<%= request.getAttribute("customerId") %>">
                <input type="hidden" name="balance" value="<%= request.getAttribute("balance") %>">
                <input type="hidden" name="action" value="GenerateAccount"> 
                <div class="d-grid gap-2"> 
                    <button type="submit" class="btn btn-success">Generate Account Number</button> 
                </div> 
            </form> 
        </div> 
    </div> 
</div> 
 
<!-- Bootstrap JS (Optional) --> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script> 
</body> 
</html>