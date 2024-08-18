<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Transaction Details</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body> 
<div class="container mt-5"> 
    <h2 class="text-center mb-4">Transaction Details</h2> 
     
    <!-- Filtering Inputs --> 
    <div class="row mb-3"> 
        <div class="col-md-4"> 
            <input type="text" id="transactionTypeFilter" class="form-control" placeholder="Filter by Transaction Type"> 
        </div> 
        <div class="col-md-4"> 
            <input type="text" id="amountFilter" class="form-control" placeholder="Filter by Amount"> 
        </div> 
        <div class="col-md-4"> 
            <input type="text" id="dateFilter" class="form-control" placeholder="Filter by Date"> 
        </div> 
    </div> 
     
    <!-- Sorting Dropdowns --> 
    <div class="row mb-3"> 
        <div class="col-md-6"> 
            <select id="sortBy" class="form-select"> 
                <option value="transactionId">Sort by Transaction ID</option>  
                <option value="amount">Sort by Amount</option> 
                <option value="date">Sort by Date</option> 
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
        <table id="transactionTable" class="table table-bordered table-striped"> 
            <thead class="table-dark"> 
                <tr> 
                    <th scope="col">Transaction ID</th> 
                    <th scope="col">Sender Account Number</th> 
                    <th scope="col">Receiver Account Number</th> 
                    <th scope="col">Transaction Type</th> 
                    <th scope="col">Amount</th> 
                    <th scope="col">Date</th> 
                </tr> 
            </thead> 
            <tbody> 
                <c:forEach var="transaction" items="${transactions}"> 
                    <tr> 
                        <td>${transaction.getTransactionId()}</td> 
                        <td>${transaction.getSenderAccountNumber()}</td> 
                        <td>${transaction.getReceiverAccountNumber()}</td> 
                        <td>${transaction.getTransactionType()}</td> 
                        <td>${transaction.getAmount()}</td> 
                        <td>${transaction.getDate()}</td> 
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
        // Filter the table based on input fields 
        $('#transactionTypeFilter, #amountFilter, #dateFilter').on('keyup', function() { 
            var transactionTypeValue = $('#transactionTypeFilter').val().toLowerCase(); 
            var amountValue = $('#amountFilter').val().toLowerCase(); 
            var dateValue = $('#dateFilter').val().toLowerCase(); 
             
            $('#transactionTable tbody tr').filter(function() {  
                var transactionType = $(this).find('td:nth-child(4)').text().toLowerCase(); 
                var amount = $(this).find('td:nth-child(5)').text().toLowerCase(); 
                var date = $(this).find('td:nth-child(6)').text().toLowerCase(); 
                 
                $(this).toggle( 
                    transactionType.indexOf(transactionTypeValue) > -1 && 
                    amount.indexOf(amountValue) > -1 && 
                    date.indexOf(dateValue) > -1 
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
            var rows = $('#transactionTable tbody tr').get(); 
             
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
                $('#transactionTable').children('tbody').append(row); 
            }); 
        }); 
         
        function getColumnIndex(sortBy) { 
            switch (sortBy) { 
                case 'transactionId': 
                    return 1; 
                case 'senderAccount': 
                    return 2; 
                case 'receiverAccount': 
                    return 3; 
                case 'transactionType': 
                    return 4; 
                case 'amount': 
                    return 5; 
                case 'date': 
                    return 6; 
                default: 
                    return 1; 
            } 
        } 
    }); 
</script>
</body> 
</html>