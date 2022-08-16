package com.codeo.inheritance;

public class Runner3 {

	public static void main(String[] args) {
	Parent p=new Parent(10,10);
	p.myFunc();
	Child c=new Child(10,5,10);

	c.myFunc();
	c.calculateVolumeOfCube();


	}

}
