package com.codeo.thread;
//by implementing Runnable Interface
//by extending Thread class
public class Process1 extends Thread {
     public void run() {
		try {
		System.out.println("Thread "+Thread.currentThread().getId()+" is working");
	}
		catch(Exception e) {
	    	e.printStackTrace();
	    	System.out.println("Exception is caught");
	     }
     }
     
	public static void main(String[] args) {
	
		
		int number=14;
		for(int i=number;i>0;i--) {
		Process1 p1=new Process1();
		p1.start();
	
		}
	
	}

}
