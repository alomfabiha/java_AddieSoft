package class_15_nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class server_socket {

	public static void main(String[] args) {
		try {
		Socket socket= new Socket("localhost",8001);
		OutputStream out= socket.getOutputStream();
		PrintWriter writer=new PrintWriter(out,true);
		
		InputStream input=socket.getInputStream();
		BufferedReader reader=new BufferedReader(new InputStreamReader(input));
		//send msg from server
		writer.println("Hi server");
		
		//response from server
		String response=reader.readLine();
		System.out.println("Received from server ");
		
		//close connection
		socket.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
