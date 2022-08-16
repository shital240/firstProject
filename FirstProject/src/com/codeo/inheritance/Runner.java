package com.codeo.inheritance;

public class Runner {

	public static void main(String[] args) {
		BasicWhatsapp bw=new BasicWhatsapp();
		bw.chatMassenger();
		Whatsapp1 wa1=new Whatsapp1();
		wa1.chatMassenger();
		wa1.audioCall();
		Whatsapp2 wa2=new Whatsapp2();
		wa2.chatMassenger();
		wa2.audioCall();
		wa2.videoCall();
		Addition5 add3=new Addition5(1, 2, 3,4,5);
        add3.calculateAdditionof3();
        add3.addInBaseClass();
        add3.add5Variables();
        System.out.println(add3.addition(1, -4));
	}

}
