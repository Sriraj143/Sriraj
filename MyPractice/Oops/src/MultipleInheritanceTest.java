
class A{
	void msg(){
		System.out.println("Hi");
	}
}
class B extends A{
	void  msg(){
		System.out.println("Hello");
	}
}
class MultipleInheritanceTest extends A,B{

	public static void main(String[] args) {
		MultipleInheritanceTest m=new MultipleInheritanceTest();
		m.msg();
	}

}
