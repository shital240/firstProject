package com.codeo.thread;

public class SingleThreaded {
	public void run() {
		for(int i=0;i<=11;i++) {
			System.out.println("Child Process: "+i);
		}
	}
	public static void main(String[] args) {
		SingleThreaded st=new SingleThreaded();
		
		for(int j=1;j<=11;j++) {
			System.out.println("Main Process: "+j);
		}
		st.run();
	}

}
