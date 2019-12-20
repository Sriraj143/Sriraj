package com.collections;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	String name;float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

public class HashMapEmp {
	
	public static void main(String[] args) {
		HashMap<Employee,String> hm=new HashMap<Employee,String>();
		Employee e1=new Employee();
		e1.setId(100);
		e1.setName("Raj");
		e1.setSalary(80000);
		
		hm.put(e1,"India");
		
		Employee e2=new Employee();
		e2.setId(101);
		e2.setName("Sri");
		e2.setSalary(40000);
		
		hm.put(e2,"Usa");
		
		for(Map.Entry<Employee,String> m:hm.entrySet()){
			Employee key=m.getKey();
			String value=m.getValue();
			System.out.println(key+" "+value);
			
		}
	}

}
