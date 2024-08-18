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

import com.aurionpro.data.UserDbUtil;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDbUtil userDbUtil = null;
    private RequestDispatcher dispatcher = null;
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userDbUtil = new UserDbUtil();
//		HttpSession session = request.getSession();
		userDbUtil.connectToDb();
		List<User> users = userDbUtil.getUsers();
		//Debugging Block
		System.out.println("Users List Size: " + users.size());
		for(User user : users) {
		    System.out.println("User: " + user.getUsername() + ", " + user.getPassword());
		}
		request.setAttribute("users", users);
		
		dispatcher = request.getRequestDispatcher("UserView.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
