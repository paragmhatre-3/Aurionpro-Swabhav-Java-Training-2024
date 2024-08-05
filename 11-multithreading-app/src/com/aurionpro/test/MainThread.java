package com.aurionpro.test;

public class MainThread {
	public static void main(String [] args) {
		Thread thread = new Thread();
		thread = Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("MyThread");
		System.out.println(thread);
		
		for(int i = 5;i >0; i--) {
			System.out.println(Thread.currentThread().getName()+" : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
