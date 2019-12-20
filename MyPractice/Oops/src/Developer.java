
class ITEmployee {
	
	String name="Raj";
}
	class Developer extends ITEmployee{
		float sal=80000;
	public static void main(String[] args) 
	{
    Developer d=new Developer();
    System.out.println("Name of the developer"+d.name);
    System.out.println("Salary of the developer"+d.sal);
	}

}
