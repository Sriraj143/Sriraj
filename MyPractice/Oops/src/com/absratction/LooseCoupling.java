package com.absratction;
interface Vehicle{
	void go();
}
class Car implements Vehicle{
	Vehicle vehicle;

	public void go() {

		System.out.println("Journey started by car");
	}
}
class Bike implements Vehicle{

	public void go() {

		System.out.println("Journey started by bike");
	}
}
public class LooseCoupling {

	public static void main(String[] args) {
 
		Car c=new Car();
		c.go();
		Bike b=new Bike();
		b.go();
	}
}
