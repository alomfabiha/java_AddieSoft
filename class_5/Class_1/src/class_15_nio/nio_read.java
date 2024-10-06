package class_15_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class nio_read {

	public static void main(String[] args) {
		try {
			Path path=Path.of("fabiha2.txt");
			FileChannel fileChannel=FileChannel.open(path,StandardOpenOption.READ);
			//String content ="Hello mine ";
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			//buffer.put(content.getBytes());
			
			fileChannel.read(buffer);
			buffer.flip();
			
			String result=new String(buffer.array(),0,buffer.limit());
			System.out.println("File : "+result);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
