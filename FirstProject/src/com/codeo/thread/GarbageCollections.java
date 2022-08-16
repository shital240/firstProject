package com.codeo.thread;

public class GarbageCollections {

	int i;//0==>3
	public GarbageCollections(int i) {
	System.out.println("Created: "+this);
	}
	public GarbageCollections() {
		// TODO Auto-generated constructor stub
	}
	public void finalize() {
		
		System.out.println("Destruction: "+this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new GarbageCollections(); //unused Object
       GarbageCollections gc=new GarbageCollections();
           gc.finalize();
           new GarbageCollections(3);
	}

}
