package com.codeo.collect;

public class Merchant {

	int merchant_id;
	String merchant_name;
	double merchant_income;
	public Merchant(int merchant_id, String merchant_name, double merchant_income) {
		super();
		this.merchant_id = merchant_id;
		this.merchant_name = merchant_name;
		this.merchant_income = merchant_income;
	}
	public int getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getMerchant_name() {
		return merchant_name;
	}
	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}
	public double getMerchant_income() {
		return merchant_income;
	}
	public void setMerchant_income(double merchant_income) {
		this.merchant_income = merchant_income;
	}
	@Override
	public String toString() {
		return "Merchant [merchant_id=" + merchant_id + ", merchant_name=" + merchant_name + ", merchant_income="
				+ merchant_income + "]";
	}
	
	
}
