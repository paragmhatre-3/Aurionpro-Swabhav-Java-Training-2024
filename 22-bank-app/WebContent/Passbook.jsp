<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Passbook</title>  
<!-- Bootstrap CSS -->  
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">  
</head>  
<body>  
<div class="container mt-5">  
    <h2 class="text-center mb-4">Passbook</h2>  
     
    <!-- Filters --> 
    <div class="row mb-3"> 
        <div class="col-md-4"> 
            <input type="text" id="filterTransactionType" class="form-control" placeholder="Filter by Transaction Type"> 
        </div> 
        <div class="col-md-4"> 
            <input type="number" id="filterAmount" class="form-control" placeholder="Filter by Amount"> 
        </div> 
        <div class="col-md-4"> 
            <input type="date" id="filterDate" class="form-control" placeholder="Filter by Date"> 
        </div> 
    </div> 
     
    <div class="table-responsive">  
        <table class="table table-bordered table-striped" id="passbookTable">  
            <thead class="table-dark">  
                <tr>  
                    <th scope="col">Transaction ID</th>  
                    <th scope="col">Sender Account Number</th>  
                    <th scope="col">Receiver Account Number</th>  
                    <th scope="col" onclick="sortTable(3)">Transaction Type &#x25B2;</th>  
                    <th scope="col" onclick="sortTable(4)">Amount &#x25B2;</th>  
                    <th scope="col" onclick="sortTable(5)">Date &#x25B2;</th>  
                </tr>  
            </thead>  
            <tbody>  
                <c:forEach var="passbook" items="${passbook}">  
                    <tr>  
                        <td>${passbook.getTransactionId()}</td>  
                        <td>${passbook.getSenderAccountNumber()}</td>  
                        <td>${passbook.getReceiverAccountNumber()}</td>  
                        <td>${passbook.getTransactionType()}</td>  
                        <td>${passbook.getAmount()}</td>  
                        <td>${passbook.getDate()}</td>  
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
        // Filter by Transaction Type 
        $('#filterTransactionType').on('keyup', function() { 
            var value = $(this).val().toLowerCase(); 
            $('#passbookTable tbody tr').filter(function() { 
                $(this).toggle($(this).find('td:nth-child(4)').text().toLowerCase().indexOf(value) > -1); 
            }); 
        }); 
 
        // Filter by Amount 
        $('#filterAmount').on('keyup', function() { 
            var value = parseFloat($(this).val()); 
            $('#passbookTable tbody tr').filter(function() { 
                $(this).toggle(parseFloat($(this).find('td:nth-child(5)').text()) >= value); 
            }); 
        }); 
 
        // Filter by Date 
        $('#filterDate').on('change', function() { 
            var value = $(this).val(); 
            $('#passbookTable tbody tr').filter(function() { 
                $(this).toggle($(this).find('td:nth-child(6)').text().indexOf(value) > -1); 
            }); 
        }); 
    }); 
 
    // Sorting function 
    function sortTable(columnIndex) { 
        var table = document.getElementById("passbookTable"); 
        var rows = table.rows; 
        var switching = true; 
        var shouldSwitch, i, x, y; 
        var direction = "asc";  
        var switchcount = 0; 
 
        while (switching) { 
            switching = false; 
            var rowsArray = Array.from(rows).slice(1); 
 
            for (i = 0; i < rowsArray.length - 1; i++) { 
                shouldSwitch = false; 
                x = rowsArray[i].getElementsByTagName("TD")[columnIndex]; 
                y = rowsArray[i + 1].getElementsByTagName("TD")[columnIndex]; 
 
                if (direction == "asc") { 
                    if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) { 
                        shouldSwitch = true; 
                        break; 
                    } 
                } else if (direction == "desc") { 
                    if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) { 
                        shouldSwitch = true; 
                        break; 
                    } 
                } 
            } 
 
            if (shouldSwitch) { 
                rowsArray[i].parentNode.insertBefore(rowsArray[i + 1], rowsArray[i]); 
                switching = true; 
                switchcount++; 
            } else { 
                if (switchcount === 0 && direction === "asc") { 
                    direction = "desc"; 
                    switching = true; 
                } 
            } 
        } 
    } 
</script> 
 
</body>  
</html>