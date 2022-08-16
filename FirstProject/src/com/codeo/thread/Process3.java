package com.codeo.thread;

public class Process3 extends Thread{

	
	@Override
	public void run() {
		for(int i=0;i<=9;i++) {
			System.out.println("My Process no will be: "+i);
		}
	
	}

	public static void main(String[] args) {
		Process3 p3=new Process3();
		p3.start();

	}

	
}
