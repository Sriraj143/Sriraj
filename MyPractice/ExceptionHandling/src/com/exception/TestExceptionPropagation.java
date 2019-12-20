package com.exception;

public class TestExceptionPropagation {
	
	void m(){
		int i=50/0;
	}
	void n(){
		m();
	}
	void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
 
		TestExceptionPropagation t=new TestExceptionPropagation();
		t.p();
		System.out.println("Normal flow");
		
		
	}

}
