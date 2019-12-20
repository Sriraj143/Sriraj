package com.exception;

class InvalidInsuredException extends Exception{
	public InvalidInsuredException(String s) {
		super(s);
	}
} 
public class TestCustomException {

	static void validate(String planName,int age,double coverage) throws InvalidInsuredException{
		if(age>55 && planName=="Moneyback" && coverage==350000)
			throw new InvalidInsuredException("For moneyback policy age is exceeded");
		else
			System.out.println("Eligible for moneyback policy");
	}
	public static void main(String[] args) throws InvalidInsuredException {
		try{
		validate("Moneyback",56,350000.0);
		}
		catch(InvalidInsuredException i){
			System.out.println("InvalidInsuredException"+i);
		}
	}

}
