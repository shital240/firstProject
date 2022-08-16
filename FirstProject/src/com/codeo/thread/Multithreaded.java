package com.codeo.thread;

public class Multithreaded extends Thread {

	
	public static void main(String[] args) {
	Multithreaded mmt=new Multithreaded();
	mmt.start();
	for(int j=1;j<=11;j++) {
		System.out.println("Main Process: "+j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	}
public void run() {
		for(int i=0;i<=11;i++) {
			System.out.println("Child Process: "+i);
		}
	}

}
