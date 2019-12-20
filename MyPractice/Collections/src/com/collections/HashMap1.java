package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Raj");
		hm.put(2,"Sri");
		hm.put(3,"Pandu");
		hm.put(4,"Dinu");
		
		System.out.println("After invoking the put()");
        for(Map.Entry m:hm.entrySet()){
        	System.out.println(m.getKey()+" "+m.getValue());
        }

	}

}
