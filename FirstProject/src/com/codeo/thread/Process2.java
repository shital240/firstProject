package com.codeo.thread;

public class Process2 implements Runnable {

	@Override
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
		for(int i=0;i<number;i++) {
			Process2 p2=new Process2();
			
	   Runnable t1=new Thread(p2);//Polymorphism
	    ((Thread) t1).start();
		
		}

	}

	
}
