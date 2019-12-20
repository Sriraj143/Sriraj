package com.methodoverlaoding;

class Test{
	static int add(int a,int b){
		return a+b;
	}
	static double add(int a,int b,int c){
		return a+b+c;
	}
}

public class TestMethodoverlaoding {

	public static void main(String[] args){

System.out.println(Test.add(10,11));
System.out.println(Test.add(10, 11, 13));

	}

}
