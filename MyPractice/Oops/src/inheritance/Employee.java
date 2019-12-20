package inheritance;

import com.oops.Address;

public class Employee {
	
	int id;
	String name;
	float sal;
	Address address;
	
	public Employee(int id,String name,float sal,Address address){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	void display(){
		System.out.println(id+" "+name+" "+sal);
		System.out.println(address.city+" "+address.state+" "+address.country);  	
		}

	public static void main(String[] args) {
		
    Address addr1=new Address("Vizag", "AP", "India");
    Address addr2=new Address("Hyd", "Telangana", "India");
  
    Employee e=new Employee(1, "Raj", 80000, addr1);
    Employee e1=new Employee(2, "Sri", 50000, addr2);
    e.display();
    e1.display();
	}

}
