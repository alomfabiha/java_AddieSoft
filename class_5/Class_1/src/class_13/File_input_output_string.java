package class_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_input_output_string {

	public static void main(String[] args) {
		//int character;
try {
			
			
			FileOutputStream obj=new FileOutputStream("C:\\Fabiha\\niaz.txt");
			obj.write("fabiha \n".getBytes());
		
			
			obj.close();
			
			int character;
			FileInputStream obj2=new FileInputStream("C:\\Fabiha\\niaz.txt");
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
