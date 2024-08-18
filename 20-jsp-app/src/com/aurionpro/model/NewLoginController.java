package com.aurionpro.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.data.UserDbUtil;

@WebServlet("/NewLoginController")
public class NewLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDbUtil userDbUtil = null;
    public NewLoginController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		userDbUtil = new UserDbUtil();
		userDbUtil.connectToDb();
		
		if(userDbUtil.validateCredentials(username,password)) {
			request.setAttribute("username", username);
			dispatcher = request.getRequestDispatcher("/loginSuccessful.jsp");		
	} else {
		dispatcher = request.getRequestDispatcher("/loginFailed.jsp");
		}		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
