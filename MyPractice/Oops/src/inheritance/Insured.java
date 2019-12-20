package inheritance;

import com.oops.Beneficiary;

public class Insured {
	
	String insuredName;
	float covAmount;
	Beneficiary ben;

	Insured(String insuredName,float covAmount,Beneficiary ben){
		this.ben=ben;
		this.covAmount=covAmount;
		this.insuredName=insuredName;
	}
	
	void beneficiary(){
		System.out.println("Insured name is"+" "+insuredName,"Coverage amount is"+" "+covAmount,"Beneficiary is"+" "+ben);
		System.out.println(ben.age+" "+ben.bName);
	}
	public static void main(String[] args) {
		
		Beneficiary ben1=new Beneficiary("Ajay",30);
		Beneficiary ben2=new Beneficiary("Vijay",31);
		
		Insured insured=new Insured("Kumar",1000,ben1);
		Insured insured1=new Insured("Raj",20000,ben2);
		
		insured.beneficiary();
		insured1.beneficiary();


	}

}
