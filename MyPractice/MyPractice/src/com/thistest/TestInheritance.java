package com.thistest;

class Animal{  
void eat(){System.out.println("eating...");
}
void run(){
	System.out.println("running");
}
 static void shout(){
	System.out.println("Shouting");
}
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();
c.run();
c.shout();
Animal.shout();
//c.bark();//C.T.Error  
}}  
