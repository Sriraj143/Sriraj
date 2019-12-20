
class Student implements Cloneable{
	int rollNo;
	String name;
	
	public Student(int rollNo,String name) {
		
		this.rollNo=rollNo;
		this.name=name;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}

public class TestCloning {

	public static void main(String[] args) {
		try{
		 Student s1=new Student(100, "Raj");
		 
		 Student s2=(Student)s1.clone();
		 System.out.println(s1.rollNo+" "+s1.name);
		 System.out.println(s2.rollNo+" "+s2.name);
		}
		catch(CloneNotSupportedException ce){
			System.out.println(ce);
		}
	}

}
