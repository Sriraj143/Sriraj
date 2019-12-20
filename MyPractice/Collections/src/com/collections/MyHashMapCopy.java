//Below example shows how to copy another collection to HashMap. putAll() method helps us to copy another collections to HashMap object.

package com.collections;

import java.util.HashMap;
public class MyHashMapCopy {

public static void main(String a[]){
HashMap<String, String> hm = new HashMap<String,String>();

hm.put("first","FIRST INSERTED");
hm.put("second","SECOND INSERTED");
hm.put("third","THIRD INSERTED");
System.out.println(hm);

HashMap<String,String> subMap=new HashMap<>();
subMap.put("one","Value1");
subMap.put("two","Value2");
hm.putAll(subMap);
System.out.println(hm);
}
}