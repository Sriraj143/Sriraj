package com.logical;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {

		float p,r,t;
			Scanner s=new Scanner(System.in);
            System.out.println("Enter the amt");
			p=s.nextFloat();
			System.out.println("Enter the rate of interest");
			r=s.nextFloat();
			System.out.println("Enter the time");
			t=s.nextFloat();
			for(int years=1;years<10;years++){
				System.out.println("Every consective years interest"+years+" "+"year");
			float si=p*r*t/100;
			System.out.println("Rate of interest with principle amt"+si);
			p=p+si;
			
		}
	}

}
