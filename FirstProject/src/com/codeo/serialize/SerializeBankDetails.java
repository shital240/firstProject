package com.codeo.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBankDetails {

	public static void main(String[] args) {
		BankDetails bd=new BankDetails();
        bd.account_holder_name="sudarshan";
        bd.accountno=203487656;
        bd.IFSCno="SBINO0029";
        bd.pinno=1234;
        try {
        File f=new File("F://focus-2//Bank.ser");
  	     f.createNewFile();
  	     //new file is created
       FileOutputStream fileOut = new FileOutputStream(f);
       ObjectOutputStream oos=new ObjectOutputStream(fileOut);
       oos.writeObject(bd);
       oos.close();
       fileOut.close();
       System.out.println(bd);
       System.out.println("Serialized data is saved in F://focus-2//Bank.ser");
        }
        catch(FileNotFoundException e) {
        	e.printStackTrace();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
	}

}
