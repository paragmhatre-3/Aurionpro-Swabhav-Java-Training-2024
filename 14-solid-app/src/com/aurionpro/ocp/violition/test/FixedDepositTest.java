package com.aurionpro.ocp.violition.test;

import com.aurionpro.ocp.violition.model.FestivalType;
import com.aurionpro.ocp.violition.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(123,"Parag",34000.5,5,FestivalType.NEWYEAR);
		System.out.println(fd1);
		System.out.println(fd1.calculateSimpleInterest(FestivalType.NEWYEAR));;
		
	}

}
