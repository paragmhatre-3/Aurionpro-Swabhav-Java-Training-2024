package com.aurionpro.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.data.AccountDbUtil;
import com.aurionpro.data.AdminDbUtil;
import com.aurionpro.data.CustomerDbUtil;

@WebServlet("/BankLoginController")
public class BankLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminDbUtil adminDbUtil = null;
	private CustomerDbUtil customerDbUtil = null;
	private AccountDbUtil accountDbUtil = null;
	
    public BankLoginController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if ("CustomerLogin".equals(action)) {
			customerLogIn(request,response);
        } else if ("AdminLogin".equals(action)) {
        	adminLogIn(request, response);
        } else {
            response.sendRedirect("login.jsp"); // Redirect to login page if no action matches
        }
		
		
	}

	private void customerLogIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		customerDbUtil = new CustomerDbUtil();
		accountDbUtil = new AccountDbUtil();
		customerDbUtil.connectToDb();
		if(customerDbUtil.validateCustomer(username,password)) {
			String customerId = customerDbUtil.getCustomerId(username);
			List<Long> accountNumbers = accountDbUtil.getAccountNumbers(customerId);
//			System.out.println(accountNumbers);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("customerId", customerId);
			session.setAttribute("accountNumbers", accountNumbers);
			dispatcher = request.getRequestDispatcher("/CustomerHome.jsp");		
	} else {
		dispatcher = request.getRequestDispatcher("/loginFailed.jsp");
		}		
		dispatcher.forward(request, response);
		
	}

	private void adminLogIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		adminDbUtil = new AdminDbUtil();
		adminDbUtil.connectToDb();
		if(adminDbUtil.validateAdmin(username,password)) {
			request.setAttribute("username", username);
			dispatcher = request.getRequestDispatcher("/AdminHome.jsp");		
	} else {
		dispatcher = request.getRequestDispatcher("/loginFailed.jsp");
		}		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
