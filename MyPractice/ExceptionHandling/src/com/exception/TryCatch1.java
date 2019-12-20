package com.exception;

public class TryCatch1 {

	public static void main(String[] args) {
		
		try{
			int i=50/0;
			
			 // if exception occurs, the remaining statement will not exceute which was written inside try block
	        System.out.println("rest of the code");
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
        
	catch(Exception ae1){
    	System.out.println("Cant divided by 0");
	}
		System.out.println("rest of the code");
}
}