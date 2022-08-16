package com.codeo.logicbuilding;

public class Logic2 {

	
	public void PerformGreaterthanOperation()
	{
		 int a=5, b=9, c=13;
		   if(a>b & a>c) {
			   System.out.println("a is greater");
		   }
		   else if(b>a & b>c) {
			   System.out.println("b is greater");
		   }
		   else {
			   System.out.println("c is greater");
		   }

		}
	
		public static void main(String[] args) {
			Logic2 l=new Logic2();
			l.PerformGreaterthanOperation();
	}
	}


