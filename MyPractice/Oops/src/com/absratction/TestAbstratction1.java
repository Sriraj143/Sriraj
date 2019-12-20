package com.absratction;
abstract class Policy{
	String policyName="";
	double halfEarlyAmt;
	double maturedAmt;
	public Policy(String policyName,double halfEarlyAmt,double maturedAmt) {
		
		this.policyName=policyName;
		this.halfEarlyAmt=halfEarlyAmt;
		this.maturedAmt=maturedAmt;
	}
	abstract int getCoverageDetails();
}

class Insured1 extends Policy{

	public Insured1(String policyName, double halfEarlyAmt, double maturedAmt) {
		super(policyName, halfEarlyAmt, maturedAmt);
	}
	void show(){
		System.out.println(policyName+" "+halfEarlyAmt+" "+maturedAmt);
	}

	int getCoverageDetails() {
		return 8 ;
	}
}
class Insured2 extends Policy{

	public Insured2(String policyName, double halfEarlyAmt, double maturedAmt) {
		super(policyName, halfEarlyAmt, maturedAmt);
	}
	void display(){
		System.out.println(policyName+" "+halfEarlyAmt+" "+maturedAmt);
	}

	int getCoverageDetails() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class TestAbstratction1 {

	public static void main(String[] args) {
		Insured1 i1=new Insured1("Jeevanbeema",80000,350000);
		Insured2 i2=new Insured2("Moneyback",90000,450000);
		
		
		System.out.println("Coverage details after plan matured with"+" "+i1.getCoverageDetails()+"%");
		i1.show();

		System.out.println("Coverage details after plan matured with"+" "+i2.getCoverageDetails()+"%");
		
		i2.display();
	}

}
