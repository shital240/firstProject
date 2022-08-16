package com.codeo.diamondsolution;

public class BasicImplementation implements I2{

	public static void main(String[] args) {
		I2 i=new BasicImplementation();
		i.Display();
		i.show1();
		i.show();

	}

	@Override
	public void show() {
	System.out.println("Show data");
		
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}

}
