package com.codeo.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRetrieve {
	
	public static String retrieveFileContent(String data)
	{
		String getData="";
		try {
		getData=new String(Files.readAllBytes(Paths.get(data)));
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
				
		return getData;
		
	}
	public static void main(String[] args) {
	String path="sudarshan.txt";
	
	System.out.println(retrieveFileContent(path));
	}

}
