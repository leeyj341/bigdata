package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MyNetServer03 {

	public static void main(String[] args) {
		Socket client;
		InputStream is;
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		
		try {
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				client = server.accept();
				
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				dos.writeUTF("안녕하세요 클라이언트님");
				dos.writeInt(new Random().nextInt(8) + 2);
				
				String msg = dis.readUTF();
				System.out.println(msg);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
