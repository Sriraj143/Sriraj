
public class BankInfo {

	String bankInfo;
	AccountHolder accHolder;
	
	public BankInfo(String bankInfo,AccountHolder accHolder) 
	{
		this.bankInfo=bankInfo;
		this.accHolder=accHolder;
	
	}
	void showDetails(){
		System.out.println(bankInfo);
		System.out.println(accHolder.accNum+" "+accHolder.ifsc);
	}
	
	public static void main(String ags[]){
      
		AccountHolder a1=new AccountHolder("9001","100606");
		AccountHolder a2=new AccountHolder("9002","100607");
		
		BankInfo b1=new BankInfo("AdarshBank");
	}
}
