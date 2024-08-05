package com.aurionpro.isp.solution.model;

public class Tax_Calculator {
	private ILogger logger;

	public Tax_Calculator(ILogger logger) {
		super();
		this.logger = logger;
	}
	
	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}
		catch(Exception e){
			new DB_logger().log("Divide by ZERO");
			
		}
		return tax;
	}

}