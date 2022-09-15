package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VoterApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String username=null;
       String gender=null;
       int age=0;
       String xyz=null;
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=null;
		pw=response.getWriter();
		username=request.getParameter("firstname");
		gender=request.getParameter("gender");
         
		//wrapper classes ==>
		age=Integer.parseInt(request.getParameter("age"));
		
		if(age >= 18) {
			pw.println("<h1 style='color: green'>Hey "+username +" are eligible for voting</h1>");
		}
		else {
			int diff=0;
			diff=18-age;
			pw.println("<h1 style='color: red'>Hey "+username +" will be eligible after: "+diff+" Years</h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
