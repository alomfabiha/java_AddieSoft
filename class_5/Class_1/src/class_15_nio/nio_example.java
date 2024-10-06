package class_15_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class nio_example {

	public static void main(String[] args) {
		try {
			Path path=Path.of("fabiha2.txt");
			FileChannel fileChannel=FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
			String content ="Hello mine ";
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			buffer.put(content.getBytes());
			buffer.flip();
			fileChannel.write(buffer);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
