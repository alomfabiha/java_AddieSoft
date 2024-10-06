package class_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_IOstream_throw {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Fabiha\\Niaz.txt");
		
		if(file.createNewFile()) {
			System.out.println("new file created. ");
		}
		
		else {
			System.out.println("Already exist");
		}
		if (file.exists()) {
			//System.out.println(file.canExecute());
			System.out.println("name is "+file.getName());
			System.out.println("File location :: "+file.getAbsolutePath());
		}
		else {
			System.out.println(file.canExecute());
		}
		
		FileOutputStream obj=new FileOutputStream("C:\\Fabiha\\niaz.txt");
		obj.write("fabiha ami likhbo nahhh tmr kiiii huhhhh!!!!!!!! \n".getBytes());
	
		
		obj.close();
		
		int character;
		FileInputStream obj2=new FileInputStream("C:\\Fabiha\\niaz.txt");
		while((character=obj2.read())!=-1) {
	          //use char for type casting
			System.out.print((char)character);
	}
		
		obj2.close();

	}

}
