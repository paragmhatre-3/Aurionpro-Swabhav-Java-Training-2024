package com.aurionpro.creational.factory.model;

public interface IAccountFactory {
	public IAccount createAccount(double accountNumber, String name, int balance, int variant);
}
