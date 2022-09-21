package com.codeo.studentdetails;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig(maxFileSize = 16177215)
public class Student_details extends HttpServlet {
	
	String name,email,dob,password;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name=request.getParameter("firstName");
		email=request.getParameter("email");
		password=request.getParameter("password");
		dob=request.getParameter("date");
		Part file=request.getPart("profilepic");
		System.out.println(file);
		//get the submitted fileName
		String imageFileName=file.getSubmittedFileName();
        if(file !=null) {
        	System.out.println(file.getName());
			System.out.println(file.getSize());
			System.out.println(file.getContentType());
        }
		InputStream ios=null;
         ios=file.getInputStream();
		System.out.println("Selected image fileName: "+imageFileName);
	     StudentDetailsDao sdao=new StudentDetailsDao();
	    sdao.addDetails(name,email,password,dob,ios);
		
	}

}
