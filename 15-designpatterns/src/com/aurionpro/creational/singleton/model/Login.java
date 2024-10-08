package com.aurionpro.creational.singleton.model;

public class Login {
	private static Login login;

	private Login() {
		System.out.println("Login has been created");
	}

	public void status() {
		System.out.println("Login Successful");
	}

	public static Login getLogin() {
		if (login == null)
			login = new Login();
		return login;
	}
}
