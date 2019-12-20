
public class Employee {
	
	String name;
	int id;
	Address address;

	Employee(String name,int id,Address address){
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String args[]){
		Address address1=new Address("Hyd","Telangana","India");
		Address address2=new Address("Vskp","AP","India");

		
		Employee e1=new Employee("Raj",661, address1);
		Employee e2=new Employee("Sri",662,address2);
		
		e1.display();
		e2.display();
		
			}
}
