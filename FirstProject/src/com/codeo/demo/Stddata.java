package com.codeo.demo;

import java.util.Scanner;

public class Stddata 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
				
		while(true)
		{
	     System.out.println("Enter student roll number:   ");
		 int stdid=s.nextInt();
		 System.out.println("Enter student name:   ");
		 String stdname=s.next();
		 System.out.println("Enter student marks:   ");
		 int stdmarks=s.nextInt();       
		 System.out.println("Student roll number is :\n " + stdid);
		 System.out.println("Student name is :\n "  + stdname);
		 System.out.println("Student marks is : \n "  +  stdmarks);
		 System.out.println("You want one more data : " );
		 String input=s.next();

		if(input.equals("yes"))
			{
			
			   continue;
			    
			}
		else
			{
			System.out.println("stop the data " );

			break;
			}
		

		}
		s.close();
	


	}
}

