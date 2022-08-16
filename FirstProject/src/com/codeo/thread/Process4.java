package com.codeo.thread;

public class Process4 implements Runnable {
	@Override
	public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("The value of i after implementing runnable interface will be: "+i);
	}
	try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	

	

}
