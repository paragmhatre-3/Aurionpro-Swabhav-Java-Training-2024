package com.aurionpro.isp.violition.test;

import com.aurionpro.isp.violition.model.IWorker;
import com.aurionpro.isp.violition.model.Labour;
import com.aurionpro.isp.violition.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		
		IWorker robot = new Robot();
		robot.startWork();

	}

}
