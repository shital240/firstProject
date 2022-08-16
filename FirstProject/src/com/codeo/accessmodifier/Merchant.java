package com.codeo.accessmodifier;

public class Merchant {
	//default variables
	//default variables are accessible throughout the class
	//default variables are accessible throughout the pakage
	//default variables are not accessible throughout the project
	//private variables are accessible throughout the class
	//private variables are not accessible throughout the pakage
	//private variable are not accessible throughout the project
	//public variables accessible throughout the class
	//public variables are accessible throughout the pakage
	//public variables are accessible throughout the project
	//protected  variables are accessible throughout the class
	//protected variables are accessible throughout the pakage
	//protected variable are not accessible throughout the project
	protected int merchant_id=2;
protected String merchant_name="Himanshu";
protected double merchant_income=24322311.432;
//default method
//default method is accessible throughout the class
//default method is accessible throughout the pakage
//default method is not accessible throughout the project

void displayMessage()
{
	System.out.println("Welcome to Display Message");
}
//private method
//private method is accessible throughout the class
//private method is not accessible throughout the pakage
//private method is not accessible throughout the project

private void displayMsg() {
	System.out.println("Welcome to Display Private Message");
}

protected void displayText() {
	System.out.println("Welcome to protected Method");
}
//protected Method
//protected method is accessible throughout the class
//protected method is accessible thoroughout the pakage
//protected method is not accessible throughout the project
//why main method is public
//It should be accessible throughout the project
public static void main(String[] args) {
		Merchant m1=new Merchant();
		System.out.println(m1.merchant_id+" "+m1.merchant_name+" "+m1.merchant_income);
	    m1.displayMessage();
	    m1.displayMsg();
	    m1.displayText();
	}
	

}
