package com.collections;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapRead {

	public static void main(String[] args) {

		HashMap<String,String> hm=new HashMap();
		hm.put("Name1","Raj");
		hm.put("Name2","Sri");
		hm.put("Name3","Dinu");
		hm.put("Name3","Pandu");
		
		/*TreeMap<String,String> sortedMap=new TreeMap(hm);
		System.out.println(sortedMap);*/
		
		System.out.println(hm);
		Set<String> keys=hm.keySet();
		for(String key:keys){
			System.out.println("Value of "+key+" is"+" "+hm.get(key));
		}
		
	}

}
