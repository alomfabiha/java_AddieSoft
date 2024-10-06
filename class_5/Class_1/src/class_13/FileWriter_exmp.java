package class_13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_exmp {

	public static void main(String[] args) {
	 
		try {
		//inside memory te file er moddhe kichu lekha ba rakha holo file write er kqaj
		FileWriter obj=new FileWriter("C:\\Fabiha\\fabiha.txt");
		
		obj.write("hi\n");
		
		obj.close();
		System.out.println("hahahhahaha");
		
		}catch(IOException e){
			//printStackTrace javar nijossho exception
		System.out.print("paro ni");
			//e.printStackTrace();
		}
		
	}

}
