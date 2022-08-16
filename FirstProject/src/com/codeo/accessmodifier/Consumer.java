package com.codeo.accessmodifier;

private class Consumer {
   public 	int Consumer_id;
   public 	String Consumer_name;
  public	double Consumer_income;

	//default constructor is accessible throughout the class
	
	public Consumer(int consumer_id, String consumer_name, double consumer_income) {
		super();
		Consumer_id = consumer_id;
		Consumer_name = consumer_name;
		Consumer_income = consumer_income;
	}


	public static void main(String[] args) {
	
		Consumer c1=new Consumer(1,"sudarshan",2323.32);
		System.out.println(c1.Consumer_id+" "+c1.Consumer_name);

	}

}
