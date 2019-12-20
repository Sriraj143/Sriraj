import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArrayListSerialization {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		try{
			//Serialization  
			FileOutputStream fos=new FileOutputStream("D:\\Object.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			
		fos.close();
		oos.close();
		
		//DeSerialization  
		FileInputStream fis=new FileInputStream("D:\\Object.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ArrayList list=(ArrayList)ois.readObject();
		System.out.println(list);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
