package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient03 {

	public static void main(String[] args) {
		Socket socket;
		InputStream is;
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		
		try {
			socket = new Socket("70.12.115.51", 12345);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			String msg = dis.readUTF();
			System.out.println(msg);
			int randNum = dis.readInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(randNum + " x " + i + " = " + (randNum * i));
			}
			if(randNum % 2 == 0) {
				dos.writeUTF("짝수");
			} else {
				dos.writeUTF("홀수");
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
