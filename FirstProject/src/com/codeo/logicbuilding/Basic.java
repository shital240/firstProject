package com.codeo.logicbuilding;
import com.codeo.accessmodifier.*;
// if you are accssing methods/ variables or
//extending the class you have to import the pakage
// it will be mandatory
import com.codeo.accessmodifier.Merchant;

public class Basic {

	public static void main(String[] args) {
		int a=10;//==> a=4
		int b=4; //==> b=10
		int c=0;
		c=b;
		b=a;
		a=c;
		System.out.println("a: "+a+" b: "+b);
        
		a=a+b; //==> a=14
		b=a-b; //==>b=10
		a=a-b; //==>a=4
		System.out.println("a: "+a+" b: "+b);
	}

}
