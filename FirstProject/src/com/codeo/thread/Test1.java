package com.codeo.thread;

public class Test1 extends Thread {

	public static void main(String[] args) {
	Test1 test =new Test1();
	test.setDaemon(false);
	test.start();
	for(int i=1;i<=11;i++) {
		System.out.println("Main Method: "+i);
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	System.out.println("Main Demon Thread exists");

	}
	
	public void run() {
		for(int i=1;i<=11;i++) {
			System.out.println("Child Process: "+i);
			try {
				Thread.sleep(20);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child Demon Thread exists");
	}

}
