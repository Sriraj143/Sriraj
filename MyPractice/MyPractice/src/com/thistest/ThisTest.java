//this() constructor call can be used to invoke the current class constructor. 

package com.thistest;

class A{
	A(){
		System.out.println("calling constructor A()");
	} 
	A(String name){
		this();
		System.out.println(name);
	}
}
class Employee{
	Employee(){
		System.out.println("Caling default contructor");
	}
	Employee(float sal){
		this();
		System.out.println("Salay of employee1 is"+" "+sal);
	}
}
class Student{
	Student(){
		System.out.println("calling student class constructor");
	}
	Student(String name){
		System.out.println("Name of the student"+" "+name);
	}
}
public class ThisTest {

	public static void main(String[] args) {
	Employee e=new Employee(90000);
    A a=new A("Raj");		
    Student s=new Student("Ajay");
	}
}
