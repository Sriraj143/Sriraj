package com.exception;

class InvalidBeneficiaryException extends Exception{
	public InvalidBeneficiaryException(String s) {
		super(s);
	}
}
public class TestCustomException1 {
 
	static void validateBeneficiary(String relation,int age) throws InvalidBeneficiaryException{
		if(relation=="Son"|| relation=="Daughter" || relation=="Wife" && age>50)
			throw new InvalidBeneficiaryException("Beneficiary will be benefited from policy");
		else
			System.out.println("You must be either son or daughter or wife to get benefited from this plan");
	}
	
	public static void main(String[] args) {
		
		try{
			validateBeneficiary("Brother",51);
		}
		catch(InvalidBeneficiaryException ib){
			System.out.println("InavalidBeneficiaryException"+ib);
		}
		
		

	}

}
