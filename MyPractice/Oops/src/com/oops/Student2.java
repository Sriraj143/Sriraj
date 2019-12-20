//initialize object through reference
package com.oops;

class Student{
	
	int id;
	String name;
}

public class Student2 {
	
	public static void main(String[] args) {

		Student s=new Student();
		s.id=100;
		s.name="Raj";
		System.out.println(s.id+" "+s.name);
	}

}
