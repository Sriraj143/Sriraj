package com.absratction;

abstract class  Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing rectangle");
	}
}
class Circle extends Shape{

	void draw() {
		
		System.out.println("Drawing circle");	
	}
}
public class TestAbstarction {

	public static void main(String[] args) {

		Shape s1=new Rectangle();
		Shape s2=new Circle();
		
		s1.draw();
		s2.draw();
	}
}
