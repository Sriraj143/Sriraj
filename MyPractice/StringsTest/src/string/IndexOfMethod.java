package string;

public class IndexOfMethod {

	public static void main(String[] args) {
		
		String str="Iam Rajkumar from velagathodu";
		int index1=str.indexOf("m");
		int index2=str.indexOf("from",12);
		
		System.out.println(index1+" "+index2);
	    int index3=str.indexOf("Rajkumar");
	    System.out.println(index3);
	    
	    int index4=str.indexOf("Iam");
	    System.out.println(index4);
	    
	    char ch=str.charAt(5);
	    System.out.println(ch);
	    
	    System.out.println(str.substring(6));
	    System.out.println(str.substring(0,8));
	}

}
