package com.aurionpro.model;

public class Transaction {
	private int transactionId;
	private long senderAccountNumber;
	private long receiverAccountNumber;
	private String transactionType;
	private double amount;
	private String date;
	
	public Transaction() {
		super();
	}

	public Transaction(int transactionId, long senderAccountNumber, long receiverAccountNumber,
			String transactionType, double amount, String date) {
		super();
		this.transactionId = transactionId;
		this.senderAccountNumber = senderAccountNumber;
		this.receiverAccountNumber = receiverAccountNumber;
		this.transactionType = transactionType;
		this.amount = amount;
		this.date = date;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}

	public void setSenderAccountNumber(long l) {
		this.senderAccountNumber = l;
	}

	public long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}

	public void setReceiverAccountNumber(long l) {
		this.receiverAccountNumber = l;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", senderAccountNumber=" + senderAccountNumber
				+ ", receiverAccountNumber=" + receiverAccountNumber + ", transactionType=" + transactionType
				+ ", amount=" + amount + ", date=" + date + "]";
	}
}
