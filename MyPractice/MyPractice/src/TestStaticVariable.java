
class Student{
	
	int rollno;
	static String college="Ebix";
	
    String name;  

    static void change(){
		college="IBM";	
	}
    
	Student(int r,String n){
		
		rollno=r;
		name=n;
	}

	void display(){
		//String college="Cts";
		System.out.println(rollno+" "+name+" "+college);
	}
	/*static void change(){
		college="IBM";
	}*/
}

public class TestStaticVariable {

	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"Suri");
		Student s2=new Student(2, "Ajay");
		
		s1.display();
		s2.display();
		
	}

}
