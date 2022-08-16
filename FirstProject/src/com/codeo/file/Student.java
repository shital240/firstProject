package com.codeo.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws IOException {
		Scanner s= new Scanner(System.in);
		int stdid=0;	
		 String stdname=null;
		 int stdmarks=0;
		 FileOutputStream fos=null;
		while(true)
		{
	     System.out.println("Enter student roll number:   ");
		 stdid=s.nextInt();
		 System.out.println("Enter student name:   ");
		stdname=s.next();
		 System.out.println("Enter student marks:   ");
		stdmarks=s.nextInt();       
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
	
		File file=new File("sunil.txt");
	      try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	   
	      String str=stdname+" "+String.valueOf(stdid)+" "+String.valueOf(stdmarks);
	      try {
			 fos=new FileOutputStream(file,true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	char arr[]=str.toCharArray();
		//w e l c o m e ..
		//arr[0] arr[1] .....
		for(int i=0;i<=arr.length-1;i++) {
			fos.write(arr[i]);
			//fos.write('W')
			//fos.write('e')
		}
		fos.close();
	  	
		}
		

	}


