package string;

public class StringEqualsTest {

	public static void main(String[] args) {
    
		String s1="Raj";
		String s2=s1;
		String s3=new String("Raj");
		String s4=new String("Raj");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		System.out.println(s3==s4);//false
		
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//false
		System.out.println(s3.equals(s4));//true
		
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
	}

}
