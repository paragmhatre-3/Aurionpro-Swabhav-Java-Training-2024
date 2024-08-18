package com.aurionpro.model;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.CustomerDbUtil;
import com.aurionpro.data.TransactionDbUtil;

@WebServlet("/CustomerHomeController")
public class CustomerHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDbUtil customerDbUtil = null;
	private TransactionDbUtil transactionDbUtil = null;
	private RequestDispatcher dispatcher = null;

	public CustomerHomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if ("Passbook".equals(action)) {
			fetchPassbook(request, response, dispatcher);
		} else if ("NewTransaction".equals(action)) {
			newTransaction(request, response);
		} else if ("EditProfile".equals(action)) {
			editProfile(request, response, dispatcher);
		} else if ("NewTransaction2".equals(action)) {
			newTransaction2(request, response);
		} else if ("EditProfile2".equals(action)) {
			editProfile2(request, response, dispatcher);
		} else {
			response.sendRedirect("login.jsp");
			// Redirect to login page if no action matches
		}
	}

	private void editProfile2(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher2)
			throws IOException, ServletException {
		customerDbUtil = new CustomerDbUtil();
		HttpSession session = request.getSession(false);
		String customerId = (String) session.getAttribute("customerId");
		String username = (String) session.getAttribute("username");
		String oldPassword = (String) request.getParameter("oldPassword");
		System.out.println(oldPassword);
		String newPassword = (String) request.getParameter("newPassword");
		String firstName = (String) request.getParameter("firstName");
		String lastName = (String) request.getParameter("lastName");
		if (!isValidPassword(newPassword)) {
			request.setAttribute("errorMessage",
					"Password must be at least 8 characters long and must contain at least one number and one special character.");
			request.getRequestDispatcher("EditProfile.jsp").forward(request, response);
			return;
		}
		if (customerDbUtil.validateCustomer(username, oldPassword)) {
			customerDbUtil.editCustomer(customerId, newPassword, firstName, lastName);
			request.setAttribute("successMessage", "Edit Profile Successful!");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Edit Profile Failed!");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}

	}

	private void newTransaction2(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		transactionDbUtil = new TransactionDbUtil();
		HttpSession session = request.getSession(false);
		String customerId = (String) session.getAttribute("customerId");
		Long senderAccount = Long.parseLong(request.getParameter("senderAccount"));
		System.out.println(senderAccount);
		Long receiverAccount = null; // Declare the variable outside the if-else block
		if (request.getParameter("receiverAccount") == null || request.getParameter("receiverAccount").isEmpty()) {
			// If the parameter is null or empty, receiverAccount will remain null
		} else {
			receiverAccount = Long.parseLong(request.getParameter("receiverAccount"));
		}

		System.out.println(receiverAccount);
		String transactionType = request.getParameter("transactionType");
		System.out.println(transactionType);
		Double amount = Double.parseDouble(request.getParameter("amount"));
		String dateString = request.getParameter("date");
		Date date = Date.valueOf(dateString);
		System.out.println(date);
		// System.out.println(amount);
		// System.out.println(request.getParameterNames());
		// System.out.println(customerId);
		transactionDbUtil.connectToDb();
		if(receiverAccount == null) {
			transactionDbUtil.addTransactionOther(senderAccount, transactionType, amount, date);
		}else {
			transactionDbUtil.addTransaction(senderAccount, receiverAccount, transactionType, amount, date);

		}
		
		request.setAttribute("successMessage", "Transaction added successfully!");
		dispatcher = request.getRequestDispatcher("CustomerHome.jsp");
		dispatcher.forward(request, response);

	}

	private void editProfile(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String customerId = (String) session.getAttribute("customerId");
		String username = (String) session.getAttribute("username");
		session.setAttribute("customerId", customerId);
		session.setAttribute("username", username);
		dispatcher = request.getRequestDispatcher("EditProfile.jsp");
		dispatcher.forward(request, response);
	}

	private void newTransaction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		transactionDbUtil = new TransactionDbUtil();
		HttpSession session = request.getSession(false);
		String customerId = (String) session.getAttribute("customerId");
		// System.out.println(customerId);
		transactionDbUtil.connectToDb();
		List<Long> accountNumbers = (List<Long>) session.getAttribute("accountNumbers");
		session.setAttribute("customerId", customerId);
		session.setAttribute("accountNumbers", accountNumbers);
		dispatcher = request.getRequestDispatcher("AddNewTransaction.jsp");
		dispatcher.forward(request, response);

	}

	private void fetchPassbook(HttpServletRequest request, HttpServletResponse response, RequestDispatcher dispatcher)
			throws ServletException, IOException {
		transactionDbUtil = new TransactionDbUtil();
		HttpSession session = request.getSession(false);
		String customerId = (String) session.getAttribute("customerId");
		// System.out.println(customerId);
		transactionDbUtil.connectToDb();
		List<Long> accountNumbers = (List<Long>) session.getAttribute("accountNumbers");
		List<Transaction> passbook = transactionDbUtil.getPassbook(accountNumbers);
		// System.out.println(passbook);
		// System.out.println(accountNumbers);
		// //Debugging Block
		// System.out.println("Users List Size: " + customers.size());
		// for(Customer customer : customers) {
		// System.out.println("User: " + customer.getFirstName() + ", " +
		// customer.getLastName());
		// }
		session.setAttribute("passbook", passbook);
		dispatcher = request.getRequestDispatcher("Passbook.jsp");
		dispatcher.forward(request, response);

	}

	private boolean isValidPassword(String password) {
		String passwordRegex = "^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$";
		return password.matches(passwordRegex);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
