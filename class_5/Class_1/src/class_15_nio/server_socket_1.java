package class_15_nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server_socket_1 {
	public static void main(String[] args) {
	try {
		ServerSocket serverSocket=new ServerSocket(8001);
		System.out.println("server is liesstening");
		
		Socket socket= serverSocket.accept();
		 System.out.println("client connected");
		 
		
		InputStream input=socket.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(input));
		
		
	//send msg from clint
	OutputStream output= socket.getOutputStream();
    PrintWriter writer=new PrintWriter(output,true);
    
    //re3ad msg from clint
    String message=reader.readLine();
    System.out.println("Recieved from clint"+message);
    
    //send response back to client
    writer.println("hello from server");
    
    socket.close();
    serverSocket.close();
    
	}catch(IOException e) {
		e.printStackTrace();
	}
    
}
}



