package constructor;

public class MyDetails {

	int accNo;
	String name;
	String bankName;
	
	public MyDetails(int an,String n,String bName) {
		accNo=an;
		name=n;
		bankName=bName;
	}
	
	void displayDetails(){
		System.out.println(accNo+" "+name+" "+bankName);
		}
	
	public static void main(String[] args) {
				
		MyDetails m=new MyDetails(143,"Rajkumar","Icici");
		MyDetails m1=new MyDetails(1234,"Srinija","AdarshBank");
		
		m.displayDetails();
		m1.displayDetails();
	}
}
