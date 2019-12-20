
public class ArmStrongNumber {

	public static void main(String[] args) {
		int n,a,c;
		for(int i=100;i<=1000;i++)
		{
			n=i;
			c=0;
			while(n>0)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}			
		
			if(i==c)
			{
				System.out.println("Armstrong numbers are"+" "+c);
			}
		}
	
	}
}


