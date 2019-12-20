package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	float sal;
	
	public Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public int compareTo(Employee e) {
		if(sal==e.sal)
		return 0;
		else if(sal>e.sal)
			return 1;
		else
			return -1;
	}
}

public class ComparableTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(100, "Raj", 80000));
		al.add(new Employee(101, "Sri", 4000));
		
		Collections.sort(al);
		for(Employee e:al){
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}
	}
}
