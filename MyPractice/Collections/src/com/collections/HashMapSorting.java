package com.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap();
		hm.put("Cycle","Macmilan");
		hm.put("Tv","JLbird");
		hm.put("Telephone","Grahambell");
		hm.put("Maths","SrinivasaRamanujan");
		hm.put("Cheetah","Tiger");
		
		System.out.println("Hashmap before sorting");
		
		Set<Entry<String,String>> entries=hm.entrySet();
		for(Entry<String,String> entry:entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		TreeMap<String,String> sorted=new TreeMap(hm);
		Set<Entry<String,String>> map=sorted.entrySet();
		
		System.out.println("HashMap after sorting");
		for(Entry<String,String> sorting:map){
			System.out.println(sorting.getKey()+" "+sorting.getValue());
		}
        Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>();
        		{
        	try{
        		public int compare(Entry<String,String> e1,Entry<String,String e2>){
            		String s1=e1.getValue();
            		String s2=e2.getValue();
            		return s1.compareTo(s2);
        	}
        		catch(Exception e){
                System.out.println(e);        		
}
        List<Entry<String,String>> listOfEntries=new ArrayList(entries);
        
}
	}
	}
