package com.aurionpro.behavioral.strategy.model;

public class OperationStrategy {
	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
}
