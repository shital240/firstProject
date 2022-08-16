package com.codeo.serialize;

import java.io.Serializable;

//In which Object is converted into bytecode
public class BankDetails implements Serializable {

	long accountno;
	String IFSCno;
	String account_holder_name;
	int pinno;
}
