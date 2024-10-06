package class_13;

import java.io.File;
import java.io.IOException;

public class File_io_Exception {

	public static void main(String[] args)throws  IOException{
		//file creating 
		File file=new File("C:\\Fabiha\\banaisi_file.pdf");
		
		if(file.createNewFile()) {
			System.out.println("File has created. ");
			
		}
		else {
			System.out.println("Exist");
		}
		
		if(file.exists()) {
			System.out.println("File name "+file.getName());
			System.out.println("File location :: "+file.getAbsolutePath());
			System.out.println("File delete "+file.delete());
		}
		
		else {
			System.out.println("not Exist");
	}
		
		

}
}
