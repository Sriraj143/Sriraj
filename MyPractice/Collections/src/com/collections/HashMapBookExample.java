package com.collections;

import java.util.HashMap;
import java.util.Map;

class Book{
	int id;
	String name;
	String publisher;
	String author;
	int quantity;
	
	public Book(int id,String name,String publisher,String author,int quantity){
		this.id=id;
		this.author=author;
		this.name=name;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class HashMapBookExample {

	public static void main(String[] args) {
		Map<Integer,Book> m=new HashMap();
		Book b1=new Book(1,"Let us C","Yaswanth","BPB",9);
		Book b2=new Book(2,"Selenium by Arun","Arun","Arun",10);
		
		m.put(100,b1);
		m.put(101,b2);
		
		for(Map.Entry<Integer,Book> hm:m.entrySet()){
			int key=hm.getKey();
			Book b=hm.getValue();
			System.out.println(key+"Details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity+" "+b.publisher);
		}
		

		
		
		

	}

}
