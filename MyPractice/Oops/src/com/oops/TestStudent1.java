//initialize object through constructor
package com.oops;
class Student3{
	int id;
	String name;
	float sal;
	int marks;
	float total;
	
	void insertData(int i,String n,float s){
		 id=i;
		 name=n;
		 sal=s;
	}
	
	/*void insertData(int m,float t){
		marks=m;
		total=t;
	}*/
	void displayData(){
		System.out.println(id+" "+name+" "+sal+" "+marks+" "+total);
	}
}
public class TestStudent1 {

	public static void main(String[] args) {

		Student3 s=new Student3();
		Student3 s1=new Student3();
		
		//s.insertData(100,500);
		s.insertData(103, "Sanjay", 21000);
		s1.insertData(102, "Vijay", 25000);
		
		s.displayData();
		s1.displayData();
	}

}
