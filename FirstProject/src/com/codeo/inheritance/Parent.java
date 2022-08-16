package com.codeo.inheritance;

public class Parent extends Object {

	double length;//10==>10
	double bredth;//10==>5
	//10 10
	//10 5
     public Parent(double length,double bredth) {
		
		this.length = length;
		this.bredth = bredth;
		
	}
   //function/method
	public void myFunc(){
    	 System.out.println("Currently we are in parent method");
    	 double area=0;
    	 //area=10*10==>100
    	 //area=10*5==>50
    	 area=length*bredth;
    	 System.out.println("Area of Rectangle will be: "+area+" sq.cm");
    	 
     }
}
