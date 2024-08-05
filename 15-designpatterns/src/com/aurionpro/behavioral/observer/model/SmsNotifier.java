package com.aurionpro.behavioral.observer.model;

public class SmsNotifier implements INotifier{

	@Override
	public void notification(Account account, String transactionType) {
		System.out.println("SMS Notification after your recent "+transactionType);
		System.out.println("Balance Remaining:"+account.getBalance());
		
	}

	@Override
	public void exceptionHandling(Exception e) {
		e.getMessage();
		
	}
}
