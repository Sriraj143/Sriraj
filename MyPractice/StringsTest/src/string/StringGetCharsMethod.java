package string;

public class StringGetCharsMethod {

	public static void main(String[] args) {
		
		String str=new String("Hello javatpoint how r u");
		
	char[] ch=new char[22];
	char[] ch1=new char[10];
	try{
		str.getChars(6,23,ch,0);
		//str.getChars(6,23,ch1,0);
		System.out.println(ch);
}
	catch(Exception e){
		System.out.println(e);
		
	}
	}

}
