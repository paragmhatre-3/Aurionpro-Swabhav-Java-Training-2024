package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.Labour;
import com.aurionpro.isp.solution.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		Robot robot = new Robot();
		Labour labour  = new Labour();
		
		robot.start();
		robot.stop();
		
		labour.start();
		labour.eat();
		labour.rest();
		labour.stop();

	}

}
