package com.codeo.collect;

import java.util.ArrayList;

public class Books {

	int book_id;
	String book_name;
	double book_price;
	
	public Books(int book_id, String book_name, double book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
	}
	
    

	public static void main(String[] args) {
		ArrayList<Books> tech_books=new ArrayList<>();
		tech_books.add(new Books(1,"C++ by Kanetkar sir",344.32));
		tech_books.add(new Books(2,"Head First Java",365.23));
		tech_books.add(new Books(3,"Head First Servlet",356.45));
	    
		ArrayList<Books> non_tech_books=new ArrayList<>();
		non_tech_books.add(new Books(1,"Subconcious Mind",344.32));
		non_tech_books.add(new Books(2,"Think like a billionier",365.23));
		non_tech_books.add(new Books(3,"Marketing Strategies",356.45));
		
		ArrayList<Books> all_books=new ArrayList<Books>();
		all_books.addAll(tech_books);
		all_books.addAll(non_tech_books);
		System.out.println(all_books);
		for(Books b: all_books) {
			System.out.println(b.book_id+" "+b.book_name+" "+b.book_price);
		}
		System.out.println(all_books.containsAll(tech_books));
     }

}
