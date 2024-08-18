package com.aurionpro.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginControllerSession")
public class LoginControllerSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginControllerSession() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username"); 
		  PrintWriter writer = response.getWriter(); 
		  HttpSession session = request.getSession();
		  session.setAttribute("username", username);
		   
		  writer.print("Password: <form action='PasswordControllerSession'> <input type='password' name='password'>"); 
		  writer.print("<input  type ='submit' value ='ok'></form>");	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
