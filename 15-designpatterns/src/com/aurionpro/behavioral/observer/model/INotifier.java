package com.aurionpro.behavioral.observer.model;

public interface INotifier {
	public void notification(Account account, String transactionType);
	public void exceptionHandling(Exception e);
}
