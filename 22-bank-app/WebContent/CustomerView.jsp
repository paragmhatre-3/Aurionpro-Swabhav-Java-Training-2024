<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Customer Details</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body> 
<div class="container mt-5"> 
    <h2 class="text-center mb-4">Customer Details</h2> 
     
    <!-- Filtering Inputs --> 
    <div class="row mb-3"> 
        <div class="col-md-4"> 
            <input type="text" id="firstNameFilter" class="form-control" placeholder="Filter by First Name"> 
        </div> 
        <div class="col-md-4"> 
            <input type="text" id="lastNameFilter" class="form-control" placeholder="Filter by Last Name"> 
        </div> 
        <div class="col-md-4"> 
            <input type="text" id="balanceFilter" class="form-control" placeholder="Filter by Balance"> 
        </div> 
    </div> 
     
    <!-- Sorting Dropdowns --> 
    <div class="row mb-3"> 
        <div class="col-md-6"> 
            <select id="sortBy" class="form-select"> 
                <option value="firstName">Sort by First Name</option> 
                <option value="lastName">Sort by Last Name</option> 
                <option value="balance">Sort by Balance</option> 
            </select> 
        </div> 
        <div class="col-md-6"> 
            <select id="sortOrder" class="form-select"> 
                <option value="asc">Ascending</option> 
                <option value="desc">Descending</option> 
            </select> 
        </div> 
    </div> 
     
    <div class="table-responsive"> 
        <table id="customerTable" class="table table-bordered table-striped"> 
            <thead class="table-dark"> 
                <tr> 
                    <th scope="col">First Name</th> 
                    <th scope="col">Last Name</th> 
                    <th scope="col">Account Number</th> 
                    <th scope="col">Balance</th> 
                </tr> 
            </thead> 
            <tbody> 
                <c:forEach var="customer" items="${customers}"> 
                    <tr> 
                        <td>${customer.getFirstName()}</td> 
                        <td>${customer.getLastName()}</td> 
                        <td>${customer.getAccountNumber()}</td> 
                        <td>${customer.getBalance()}</td> 
                    </tr> 
                </c:forEach> 
            </tbody> 
        </table> 
    </div> 
</div> 
 
<!-- Bootstrap JS (Optional) --> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script> 
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function() {
        // Filter the table based on search input
        $('#searchInput').on('keyup', function() {
            var value = $(this).val().toLowerCase();
            $('#customerTable tr').filter(function() {
                $(this).toggle(
                    $(this).find('td:nth-child(2)').text().toLowerCase().indexOf(value) > -1 ||
                    $(this).find('td:nth-child(3)').text().toLowerCase().indexOf(value) > -1
                );
            });
        });
    });
</script>
<script> 
    $(document).ready(function() { 
        // Filter the table based on input fields 
        $('#firstNameFilter, #lastNameFilter, #balanceFilter').on('keyup', function() { 
            var firstNameValue = $('#firstNameFilter').val().toLowerCase(); 
            var lastNameValue = $('#lastNameFilter').val().toLowerCase(); 
            var balanceValue = $('#balanceFilter').val().toLowerCase(); 
             
            $('#customerTable tbody tr').filter(function() { 
                var firstName = $(this).find('td:nth-child(1)').text().toLowerCase(); 
                var lastName = $(this).find('td:nth-child(2)').text().toLowerCase(); 
                var balance = $(this).find('td:nth-child(4)').text().toLowerCase(); 
                 
                $(this).toggle( 
                    firstName.indexOf(firstNameValue) > -1 && 
                    lastName.indexOf(lastNameValue) > -1 && 
                    balance.indexOf(balanceValue) > -1 
                ); 
            }); 
        }); 
    }); 
</script>
<script> 
    $(document).ready(function() { 
        $('#sortBy, #sortOrder').change(function() { 
            var sortBy = $('#sortBy').val(); 
            var sortOrder = $('#sortOrder').val(); 
            var rows = $('#customerTable tbody tr').get(); 
             
            rows.sort(function(a, b) { 
                var A = $(a).find('td:nth-child(' + getColumnIndex(sortBy) + ')').text().toLowerCase(); 
                var B = $(b).find('td:nth-child(' + getColumnIndex(sortBy) + ')').text().toLowerCase(); 
                 
                if (sortOrder === 'asc') { 
                    return A.localeCompare(B, undefined, { numeric: true }); 
                } else { 
                    return B.localeCompare(A, undefined, { numeric: true }); 
                } 
            }); 
             
            $.each(rows, function(index, row) { 
                $('#customerTable').children('tbody').append(row); 
            }); 
        }); 
         
        function getColumnIndex(sortBy) { 
            switch (sortBy) { 
                case 'firstName': 
                    return 1; 
                case 'lastName': 
                    return 2; 
                case 'balance': 
                    return 4; 
                default: 
                    return 1; 
            } 
        } 
    }); 
</script>
</body> 
</html>