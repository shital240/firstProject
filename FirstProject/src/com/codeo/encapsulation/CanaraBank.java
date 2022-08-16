package com.codeo.encapsulation;

public class CanaraBank {
	
	//to provide security we have to declare
	//variables as private
	public CanaraBank(){
		
	}
	public CanaraBank(long account_no, String bankBranch, String accountHolderName) {
		// TODO Auto-generated constructor stub
	}
	//accountno=3989327434
	private long accountno;
	private String account_holder_name;
	private double account_balance;
	private String bank_branch;
	static String IFSC="SBIN00023243";
	public long getAccountno() {
		return accountno;
	}
	//accountno=3989327434
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	
	
	//create method as public
	//In encapsulation there will be 2 methods
	//setter method and getter Method.
	
	

}
