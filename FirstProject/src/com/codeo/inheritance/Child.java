package com.codeo.inheritance;

public class Child extends Parent {

	double height;//10
	// 10,5,10
	public Child(double length,double bredth, double height) {
	//by using super keyword you can call base class constructor
		super(length, bredth);
		this.length=length;
		this.bredth=bredth;
		this.height=height;
		//note: constructor call must be the first statement in a constructor
		System.out.println(length+" "+bredth+" "+height);
	}

	public void calculateVolumeOfCube() {
		System.out.println("Volume of cube: "+super.length*super.bredth*height);
	}
}
