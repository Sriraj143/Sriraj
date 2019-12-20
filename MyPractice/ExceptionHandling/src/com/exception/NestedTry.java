package com.exception;

public class NestedTry {

	public static void main(String[] args) {
		
		
		try{
			try{
				int i=30/0;
			}
			catch(ArithmeticException ae){
				System.out.println(ae);
			}
			try{
				int a[]=new int[5];
				a[5]=60;
			}
			catch(ArrayIndexOutOfBoundsException ai){
				System.out.println(ai);
			}
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Normal flow");
		}
	}
}