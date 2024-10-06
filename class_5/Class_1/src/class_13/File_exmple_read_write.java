package class_13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_exmple_read_write {

	public static void main(String[] args) {
		try {
			
			int character;
			FileWriter obj=new FileWriter("C:\\Fabiha\\niaz.txt");
			obj.write("brother\n");
			
			obj.close();
			
			
			FileReader obj2=new FileReader("C:\\Fabiha\\niaz.txt");
			while((character=obj2.read())!=-1) {
				//use char for type casting
				System.out.print((char)character);
			}
			
			obj2.close();
			
			
			}catch(IOException e){
			
			System.out.print("paro ni");
				e.printStackTrace();
			}

	}

}
