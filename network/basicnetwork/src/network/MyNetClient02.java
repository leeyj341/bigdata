package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient02 {
	public static void main(String[] args) {
		//서버와 통신할 수 있는 소켓객체를 생성
		Socket socket;
		InputStream is = null;		
		DataInputStream dis = null;	
		OutputStream os = null;		
		DataOutputStream dos = null;
		try {
			socket = new Socket("70.12.115.53", 12345);
			System.out.println("서버접속완료...." + socket);
			
			//클라이언트에서도 서버와 통신할 수 있는 소켓 객체로부터 Input/Output Stream을 구한다.
			//InputStream얻기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			//outputStream 얻기
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			//1. 클라이언트 <- 서버(서버가 보내는 데이터를 읽기 - 2번 연속해서 읽기)
			String data = dis.readUTF();
			System.out.println("서버가 전송하는 메시지 1 : " + data);
			int intdata = dis.readInt();
			System.out.println("서버가 전송하는 메시지 2 : " + intdata);
			
			//2. 클라이언트 -> 서버
			dos.writeUTF("이 와중에 민재 한 표 받았어...ㅎ");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
