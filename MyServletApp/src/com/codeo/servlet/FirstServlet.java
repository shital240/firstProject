package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		PrintWriter pw=null;
		//get writer stream for response object
		//set response content type to interact with browser
		pw=response.getWriter();
		response.setContentType("text/html");
		System.out.println("PrintWriter object will be: "+pw);
		//write a logic of date displaying
		Date date=new Date();
		pw.println("<h1 style='color:red;'> Date and time will be: "+date+"</h1>");
		System.out.println(date);
		//close the pw object
		pw.close();
		
		
	}//main method

}//class
