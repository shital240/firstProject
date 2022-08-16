package com.codeo.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationBankDetails {

   

	public static void main(String[] args) {
		  BankDetails bd=null;
		try {
			//for reading or retrieving data we have used
	         FileInputStream fileIn = new FileInputStream("F://focus-2//Bank.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         bd = (BankDetails) in.readObject();
	        
	         in.close();
	         fileIn.close();
	      }
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
      finally {
    	  System.out.println("Deserialized Bank Details...");
          System.out.println("Account Holder name: "+bd.account_holder_name);
          System.out.println("Account Number: "+bd.accountno);
          System.out.println("Account IFSC code: "+bd.IFSCno);
          System.out.println("ATM Pin no will be: "+bd.pinno);
      }
	}

}
