//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods
package com.oops;

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String n,float amt){
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt){
		amount=amount+amt;
		System.out.println(amt+" deposited");
		
	}
	void withdraw(float amt){
		if(amount<amt){
			System.out.println("Insufficient funds");
		}
		else{
			amount=amount-amt;
			System.out.println(amt+" withdrawn");
		}
	}
	void checkBalance(){
		System.out.println("Balance is: "+amount);
	}
	void display(){
		System.out.println(acc_no+" "+name+" "+amount);
	}

}

public class TestAccount {

	public static void main(String[] args) {
Account a1=new Account();
Account a2=new Account();

a1.insert(1234, "Ravi", 40000);
a2.insert(4567, "Ram", 30000);

a1.deposit(20000);
a2.deposit(10000);
a1.withdraw(70000);
a2.withdraw(10000);
a1.checkBalance();
a2.checkBalance();
a1.display();
a2.display();
	}

}
