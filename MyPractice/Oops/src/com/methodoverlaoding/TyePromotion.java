//Example of Method Overloading with TypePromotion

package com.methodoverlaoding;

public class TyePromotion {

	void sum(int a,long b){
		System.out.println(a+b);
		}  
	  void sum(long a,long b){
      System.out.println(a+b);		  
	  }
	  public static void main(String args[]){  
		  TyePromotion obj=new TyePromotion();  
	  obj.sum(20,20);//now second int literal will be promoted to long  
	  /*obj.sum(30,40);  */
	  
	  }  
	}  