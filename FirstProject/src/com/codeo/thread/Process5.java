package com.codeo.thread;

public class Process5 extends Thread {
	public void run() {
	for(int i=10;i>0;i--) {
		System.out.println("The value of i after extending thread class will be: "+i);
	}
	try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		Process4 p4=new Process4();
		p4.run();
		Process5 p5=new Process5();
		p5.run();
		//Logic behind concurrent Thread is remaining
		

	}

}
