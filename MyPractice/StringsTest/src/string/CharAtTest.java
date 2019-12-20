package string;

public class CharAtTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "Welcome to Javatpoint portal";   
	    
	    int strLength=str.length();
	    
	    System.out.println(strLength);
	    System.out.println("Character at 0 index"+" "+str.charAt(0));
	    System.out.println("Character at last index"+" "+str.charAt(strLength-1));
	}

}
