package class_13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead_exmple {

	public static void main(String[] args) {
		try {
			//inside memory te file er moddhe kichu lekha ba rakha holee file read er kqaj
			FileReader obj=new FileReader("C:\\Fabiha\\fabiha.txt");
			
			//obj.read();
			
			int character;
			 
			//System.out.println("hahahhahaha");
			
			//********read the file charecter by charecter***********
			while((character=obj.read())!=-1) {
				//use char for type casting
				System.out.print((char)character);
			}
			obj.close();
			
			}catch(IOException obj2){
				//printStackTrace javar nijossho exception
			System.out.print("paro ni");
				obj2.printStackTrace();
			}

	}

}
