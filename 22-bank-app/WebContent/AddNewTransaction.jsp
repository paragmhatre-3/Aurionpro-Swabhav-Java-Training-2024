<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<%@ page import="java.util.List" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>New Transaction</title> 
<!-- Bootstrap CSS --> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
</head> 
<body>
<%
	String customerId = (String)session.getAttribute("customerId");
	;
	%>
<div class="container mt-5"> 
    <div class="row justify-content-center"> 
        <div class="col-md-6"> 
            <div class="card"> 
                <div class="card-header text-center"> 
                    <h4>New Transaction</h4> 
                </div> 
                <div class="card-body"> 
                    <form action="CustomerHomeController" method="post" enctype="application/x-www-form-urlencoded"> 
                        <input type="hidden" name="action" value="NewTransaction2"> 
 
                        <div class="mb-3"> 
                            <label for="transactionType" class="form-label">Type Of Transaction (Transfer/Credit/Debit)</label> 
                            <input type="text" class="form-control" id="transactionType" name="transactionType" placeholder="Enter transaction type"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="receiverAccount" class="form-label">Receiver Account Number (Only if Transfer)</label> 
                            <input type="text" class="form-control" id="receiverAccount" name="receiverAccount" placeholder="Enter receiver's account number"> 
                        </div> 
 
                        <div class="mb-3"> 
                            <label for="amount" class="form-label">Amount</label> 
                            <input type="text" class="form-control" id="amount" name="amount" placeholder="Enter amount"> 
                        </div> 
 						
 						<div class="mb-3"> 
                            <label for="date" class="form-label">Date</label> 
                            <input type="date" class="form-control" id="date" name="date" placeholder="Enter date"> 
                        </div> 
                        
                        <div class="mb-3"> 
                            <label for="senderAccount" class="form-label">Account Number <%List<Long> accountNumbers = (List<Long>) session.getAttribute("accountNumbers");
                            out.print(accountNumbers);%></label> 
                            <input type="text" class="form-control" id="senderAccount" name="senderAccount" placeholder="Enter sender's account number"> 
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