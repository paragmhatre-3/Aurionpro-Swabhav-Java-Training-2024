<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Edit Profile</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body> 
<div class="container mt-5"> 
    <div class="row justify-content-center"> 
        <div class="col-md-6"> 
            <div class="card"> 
                <div class="card-header text-center"> 
                    <h4>Edit Profile</h4> 
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
                    <form action="CustomerHomeController" method="post" enctype="application/x-www-form-urlencoded"> 
                        <input type="hidden" name="action" value="EditProfile2"> 
 
                        <div class="mb-3"> 
                            <label for="firstName" class="form-label">First Name</label> 
                            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter first name"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="lastName" class="form-label">Last Name</label> 
                            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter last name"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="oldPassword" class="form-label">Old Password</label> 
                            <input type="password" class="form-control" id="oldPassword" name="oldPassword" placeholder="Enter old password"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="newPassword" class="form-label">New Password</label> 
                            <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter new password"> 
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