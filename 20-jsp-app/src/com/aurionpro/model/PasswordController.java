package com.aurionpro.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PasswordController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookies[] = request.getCookies();
		
		for(Cookie cookie:cookies)
			System.out.println(cookie.getName()+":"+cookie.getValue());
		String username = cookies[0].getValue();
		String password = request.getParameter("password");
		
		response.getWriter().print("Username: "+username);
		response.getWriter().println("Password: "+password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
