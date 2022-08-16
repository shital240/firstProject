package com.codeo.encapsulation;

import java.util.Scanner;

public class Phonepe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no");
		long accountno=sc.nextLong();
		System.out.println("Person Name: ");
		String account_holder_name=sc.next();
		System.out.println("Account Balance: ");
		double account_balance=sc.nextDouble();
		System.out.println("Bank Branch: ");
		String bank_branch=sc.next();
        CanaraBank canara=new CanaraBank();
         canara.setAccountno(accountno);
         canara.setAccount_holder_name(account_holder_name);
         canara.setAccount_balance(account_balance);
         canara.setBank_branch(bank_branch);
         System.out.println("Account details of the Person: ");
         System.out.println("==============================");
         System.out.println("Account no will be: "+canara.getAccountno());
         System.out.println("Person Name will be: "+canara.getAccount_holder_name());
         System.out.println("Account Balance will be: "+canara.getAccount_balance());
         System.out.println("Bank Branch will be: "+canara.getBank_branch());
         System.out.println("IFSC code will be: "+CanaraBank.IFSC);
	
      

	
	}

}
