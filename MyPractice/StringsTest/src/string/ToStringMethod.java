package string;

public class ToStringMethod {
	
	int rollNo;
	String name;
	String city;
	
	ToStringMethod(int rollNo,String name,String city){
		this.rollNo=rollNo;
		this.city=city;
		this.name=name;
	}
  /**public String toString(){
	 return rollNo+" "+name+" "+city;
  }**/
	public static void main(String[] args) {
		
		ToStringMethod str=new ToStringMethod(1,"Raj","Hyd");
		ToStringMethod str1=new ToStringMethod(2,"Sri","Hyd");
		
		System.out.println(str);
		System.out.println(str1);
		
	}

}
