package com.codeo.thread;

public class Test extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			//this method is used to check that
			//is our current thread is demon thread.
			System.out.println("Demon Thread Work");
		}
		else {
			System.out.println("user Thread work");
		}
		
	}
	public static void main(String[] args) {
		//By default all the Threads are non Demon 
		//Threads but you can make non Demon Threads ==> Demon Threads
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		t1.start();
		
		t2.setDaemon(true);
		t2.start();
		t3.start();
		

	}

}
