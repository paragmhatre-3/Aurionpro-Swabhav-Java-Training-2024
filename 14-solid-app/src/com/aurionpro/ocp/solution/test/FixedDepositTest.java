package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterest;
import com.aurionpro.ocp.solution.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(123,"Bhakti",245000,5,new DiwaliInterest());
		System.out.println(fd1);
	}

}
