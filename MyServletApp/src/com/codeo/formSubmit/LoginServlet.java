package com.codeo.formSubmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter pw=response.getWriter();
		String email=null;
		String password=null;
		int age=0;
		response.setContentType("text/html");
		email=request.getParameter("email");
		System.out.println(email);
		password=request.getParameter("password");
		System.out.println(password);
	    //admin or student should login in this page
		//admin credentials==> admin@gmail.com admin
		//student credentials==> student@gmail.com student
		if(email.equals("admin@gmail.com") && password.equals("admin")) {
			pw.println("Welcome Admin your email is: "+email);
		}
		else if(email.equals("student@gmail.com") && password.equals("student")) {
			pw.println("Welcome Student your email is: "+email);
		}
		else {
			pw.println("please enter proper input");
		}
		
	}
	
}
