//initialize object through method
package com.oops;

class Student1{
	int id;
	String name;
	void insertRecord(int i,String n){
		id=i;
		name=n;
	}
	
	void displayInfo(){
		System.out.println(id+" "+name);
	}
}
public class TestStudent {

	public static void main(String[] args) {

		Student1 s1=new Student1();
		Student1 s2=new Student1();
		
		s1.insertRecord(100, "Raj");
		s2.insertRecord(101, "Sri");
		
		s1.displayInfo();
		s2.displayInfo();
	}
}

