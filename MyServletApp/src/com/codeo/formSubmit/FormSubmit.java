package com.codeo.formSubmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSubmit extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter pw=null;
		pw=response.getWriter();
		String name=null;
		String password=null;
		int age=0;
		response.setContentType("text/html");
		name=request.getParameter("firstname");
		password=request.getParameter("password");
		age=Integer.parseInt(request.getParameter("age"));
		System.out.println("Value inserted by frontend: "+name);
		
		if(age >= 18) {
			pw.println("Welcome Mr/Miss: "+name);
			pw.println("your age is: "+age);
		}
		else {
			pw.println("Login after 18 +");
		}
		
	}
	
}
