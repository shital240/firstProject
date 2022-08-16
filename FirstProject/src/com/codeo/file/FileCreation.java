package com.codeo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {
//It is not a good practice that main method will Handle exceptions
	public static void main(String[] args) throws IOException {
	//create a file class Object
	File file=new File("sudarshan.txt");
	//new file is created in the specific path
      file.createNewFile();
      System.out.println("The length of the file will be: "+file.length());
		FileOutputStream fos=new FileOutputStream(file,false);
		// In case (file,true) old content will exist as it is
		//new content will be append/concat with old content
		String str="Welcome to Java WEbinar";
		
		//to convert this str String into char Array
		char arr[]=str.toCharArray();
		//w e l c o m e ..
		//arr[0] arr[1] .....
		for(int i=0;i<=arr.length-1;i++) {
			fos.write(arr[i]);
			//fos.write('W')
			//fos.write('e')
		}
		fos.close();
		 System.out.println("The length of the file will be: "+file.length());
	}

}
