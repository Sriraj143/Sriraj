package constructor;

public class Bank {
	
	int accNo;
	String accHolderName;
	
    void displayDetails(){
    	System.out.println(accNo+" "+accHolderName);
    }
	
	public static void main(String[] args) {

		Bank b=new Bank();
		Bank b1=new Bank();
		
		b.displayDetails();
		b1.displayDetails();
		
		
	}

}
