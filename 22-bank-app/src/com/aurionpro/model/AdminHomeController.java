package com.aurionpro.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.AccountDbUtil;
import com.aurionpro.data.AdminDbUtil;
import com.aurionpro.data.CustomerDbUtil;
import com.aurionpro.data.TransactionDbUtil;

@WebServlet("/AdminHomeController")
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDbUtil accountDbUtil = null;
	private CustomerDbUtil customerDbUtil = null;
	private TransactionDbUtil transactionDbUtil = null;
	private RequestDispatcher dispatcher = null;
	
    public AdminHomeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if ("ViewCustomers".equals(action)) {
			viewCustomers(request,response);
        } else if ("ViewTransactions".equals(action)) {
        	viewTransactions(request,response);
        } else if("AddNewCustomer".equals(action)){
        	addCustomer(request,response,dispatcher);
        }else if("AddNewAccount".equals(action)){
        	addAccount(request,response,dispatcher);
        }else if("AddAccount2".equals(action)){
        	addAccount2(request,response,dispatcher);
        }else if("AddCustomer2".equals(action)){
        	addCustomer2(request,response);
        }else if("GenerateAccount".equals(action)) {
        	generateAccount(request,response,dispatcher);
        }else {
			response.sendRedirect("login.jsp"); // Redirect to login page if no action matches
        }
	}


	
	private void generateAccount(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher2) throws IOException, ServletException {
		String customerId = request.getParameter("customerId");
		String balanceStr = request.getParameter("balance");
		Long balance = Long.parseLong(balanceStr);
		accountDbUtil = new AccountDbUtil();
		String accountDetails = accountDbUtil.generateAccount(customerId,balance);
		request.setAttribute("successMessage", "Account added successfully!");
		dispatcher = request.getRequestDispatcher("AdminHome.jsp");
		dispatcher.forward(request, response);	
	}
	
	
	
	private void addAccount2(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher2) throws ServletException, IOException {
		String customerId = request.getParameter("customerid");
		String balanceStr = request.getParameter("balance");
		Long balance = Long.parseLong(balanceStr);
		customerDbUtil = new CustomerDbUtil();
		String customerDetails = customerDbUtil.getOneCustomer(customerId);
		request.setAttribute("customerDetails", customerDetails);
		request.setAttribute("customerId", customerId);
		request.setAttribute("balance", balance);

		dispatcher = request.getRequestDispatcher("AddNewAccount.jsp");
		dispatcher.forward(request, response);
	}

	private void addCustomer2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if (!isValidEmail(email)) {
	        request.setAttribute("errorMessage", "Invalid email format.");
	        request.getRequestDispatcher("AddNewCustomer.jsp").forward(request, response);
	        return;
	    }

	    if (!isValidPassword(password)) {
	        request.setAttribute("errorMessage", "Password must be at least 8 characters long and must contain at least one number and one special character.");
	        request.getRequestDispatcher("AddNewCustomer.jsp").forward(request, response);
	        return;
	    }
		try {
			customerDbUtil = new CustomerDbUtil();
			customerDbUtil.addCustomer(firstName, lastName, email, password);
			request.setAttribute("successMessage", "Customer added successfully!");
			response.sendRedirect("AdminHome.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void addAccount(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher) throws IOException, ServletException {
		dispatcher = request.getRequestDispatcher("AddNewAccount.jsp");
		dispatcher.forward(request, response);
		
	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher) throws IOException, ServletException {
		dispatcher = request.getRequestDispatcher("AddNewCustomer.jsp");
		dispatcher.forward(request, response);
	}

	private void viewTransactions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		transactionDbUtil = new TransactionDbUtil();
//		HttpSession session = request.getSession();
		transactionDbUtil.connectToDb();
		List<Transaction> transactions = transactionDbUtil.getTransactions();
//		//Debugging Block
//				System.out.println("Users List Size: " + customers.size());
//				for(Customer customer : customers) {
//				    System.out.println("User: " + customer.getFirstName() + ", " + customer.getLastName());
//				}
		request.setAttribute("transactions", transactions);
		dispatcher = request.getRequestDispatcher("TransactionView.jsp");
		dispatcher.forward(request, response);
		
	}

	private void viewCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerDbUtil = new CustomerDbUtil();
//		HttpSession session = request.getSession();
		customerDbUtil.connectToDb();
		List<Customer> customers = customerDbUtil.getCustomers();
//		//Debugging Block
//				System.out.println("Users List Size: " + customers.size());
//				for(Customer customer : customers) {
//				    System.out.println("User: " + customer.getFirstName() + ", " + customer.getLastName());
//				}
		request.setAttribute("customers", customers);
		dispatcher = request.getRequestDispatcher("CustomerView.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
	private boolean isValidEmail(String email) {
	    String emailRegex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
	    return email.matches(emailRegex);
	}

	private boolean isValidPassword(String password) {
	    String passwordRegex = "^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$";
	    return password.matches(passwordRegex);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
