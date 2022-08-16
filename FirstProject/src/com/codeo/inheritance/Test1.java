package com.codeo.inheritance;

class Hotel{
	public void basicHotel() {
		System.out.println("Book the hotel");
	}
}
class CenterPoint extends Hotel{
	public void basicHotel() {
		System.out.println("Book CenterPoint Hotel");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Hotel h1=new Hotel();
		CenterPoint cp=new CenterPoint();
		h1.basicHotel();
		cp.basicHotel();

	}

}
