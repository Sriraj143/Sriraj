package com.exception;

public class TryCatch2 {

	public static void main(String[] args) {
		
		try{
			int i=100/0;
		}
		catch(ArithmeticException ae){
            
			// displaying the custom message  
			System.out.println("Cant divided by 0");
		}
		System.out.println("Rest of the code");

	}

}
