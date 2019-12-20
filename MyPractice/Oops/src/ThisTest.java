
class Employee
{
	Employee(){
		System.out.println("Default constructor");
	}
	Employee(Address address){
		this();
		System.out.println(address);
	}
}
public class ThisTest {
	public static void main(String[] args) {
		Employee e= new Employee();
		
	}
}
