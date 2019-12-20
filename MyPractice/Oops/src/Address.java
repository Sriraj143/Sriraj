
public class Address {

	Developer emp;
	
	Address(Developer emp){
		this.emp=emp;
	}
		void display(){
			System.out.println(emp.city);
		}
}
class Employee1{
	String city="Hyd";
	Employee1(){
		Address address=new Address(this);
		address.display();
	}
public static void main(String args[]){
	Developer a=new Developer();
}}

