package com.aurionpro.behavioral.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.behavioral.observer.model.Account;
import com.aurionpro.behavioral.observer.model.EmailNotifier;
import com.aurionpro.behavioral.observer.model.INotifier;
import com.aurionpro.behavioral.observer.model.InvalidAmountException;
import com.aurionpro.behavioral.observer.model.SmsNotifier;
import com.aurionpro.behavioral.observer.model.WhatsAppNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<INotifier> notifiers = new ArrayList<INotifier>();
		
		System.out.println("How many Notifications do you want?");
		System.out.println("1.SMS Notification");
		System.out.println("2.Email Notification");
		System.out.println("3.WhatsApp Notification");
		System.out.println("4.SMS and Email Notifications");
		System.out.println("5.SMS and WhatsApp Notifications");
		System.out.println("6.Email and WhatsApp Notifications");
		System.out.println("7.All three Notifications!");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			notifiers.add(new SmsNotifier());
		break;
		case 2:
			notifiers.add(new EmailNotifier());
		break;
		case 3:
			notifiers.add(new WhatsAppNotifier());
		break;
		case 4:
			notifiers.add(new SmsNotifier());
			notifiers.add(new EmailNotifier());
		break;
		case 5:
			notifiers.add(new SmsNotifier());
			notifiers.add(new WhatsAppNotifier());
		break;
		case 6:
			notifiers.add(new EmailNotifier());
			notifiers.add(new WhatsAppNotifier());
		break;
		case 7:
			notifiers.add(new SmsNotifier());
			notifiers.add(new EmailNotifier());
			notifiers.add(new WhatsAppNotifier());
		break;
		default:
			System.out.println("Invalid Choice!");
		}
		
		Account account1 = new Account(123456, "Parag", 40000, notifiers);
		account1.withdraw(50000, account1);
	
		scanner.close();
	}

}
