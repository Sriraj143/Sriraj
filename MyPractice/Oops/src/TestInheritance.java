
class Animal{
	String name="Puppy";
	void eat(){
		System.out.println("Eating");
	}			
}
class Dog extends Animal{
	void bark(){
		System.out.println("Barking");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
    Dog d=new Dog();
    System.out.println("Name of the animal"+" "+d.name);
    d.bark();
    d.eat();
	}

}
