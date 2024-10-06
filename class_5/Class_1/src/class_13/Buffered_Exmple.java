package class_13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_Exmple {
 
	
	public static void main(String[] args) {
		try {
		BufferedOutputStream obj=new BufferedOutputStream(new FileOutputStream("C:\\Fabiha\\banaisi_file.pdf"));
         obj.write("okokokookokkook \n".getBytes());
         System.out.println("Gadha");
         obj.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
