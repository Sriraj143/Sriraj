
public class Pyramid {

	public static void main(String[] args) {

		int limit=6;
		
		for(int i=1;i<=limit;i++){
			
			for(int j=limit;j>=i;j--){
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
