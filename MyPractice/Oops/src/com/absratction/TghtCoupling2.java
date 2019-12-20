package com.absratction;

class Travel{
	Car c=new Car();
	
	public void start(){
		c.go();
	}
}
class Car{
	public void go(){
		System.out.println("Jorney started by car");
	}
}
public class TghtCoupling2 {

	public static void main(String[] args) {

		Travel t=new Travel();
		t.start();
	}

}
