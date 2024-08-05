package com.aurionpro.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;

public class User {
	private String email;
	private String password;
	
	public User(String email, String password) {
		super();
		if(!(isValidEmail(email)))
			throw new EmailNotValidException();
		this.email = email;
		if(!(isValidPassword(password)))
			throw new PasswordNotValidException();
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(!(isValidEmail(email)))
			throw new EmailNotValidException();
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(!(isValidPassword(password)))
			throw new PasswordNotValidException();
		this.password = password;
	}
	
	public static boolean isValidEmail(String email) {
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
	
	public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
	
	
}
