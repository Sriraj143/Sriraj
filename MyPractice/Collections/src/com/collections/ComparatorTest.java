package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Beneficiary{
	 
	String benName;
	int age;
	
	public Beneficiary(String benName,int age) {
		
		this.benName=benName;
		this.age=age;
	}
}

class BennameComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Beneficiary b1=(Beneficiary)o1;
		Beneficiary b2=(Beneficiary)o2;
		
		return b1.benName.compareTo(b2.benName);
	}
}
class BenAgeComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Beneficiary b1=(Beneficiary)o1;
		Beneficiary b2=(Beneficiary)o2;
		
		if(b1.age==b2.age)
			return 0;
		else if(b1.age>b2.age)
			return 1;
		else 
			return -1;
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(new Beneficiary("Raj",30));
		al.add(new Beneficiary("Kumar",31));
		al.add(new Beneficiary("Ajay",28));
		
		System.out.println("Sorting by name");
		Collections.sort(al,new BennameComparator());
		Iterator it=al.iterator();
		while(it.hasNext()){
			Beneficiary b=(Beneficiary)it.next();
			System.out.println(b.benName+" "+b.age);
		}
		
		System.out.println("Sorting by age");
		
		Collections.sort(al,new BenAgeComparator());
		Iterator it1=al.iterator();
		while(it1.hasNext()){
			Beneficiary b1=(Beneficiary)it1.next();
			System.out.println(b1.benName+" "+b1.age );
		}
		 
	}

}
