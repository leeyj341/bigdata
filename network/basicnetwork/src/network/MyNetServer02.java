package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer02 {

	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;			//클라이언트와 input 할 수 있는 stream
		DataInputStream dis = null;		//최종적으로 클라이언트와 DataInputStream을 이용해서 클라이언트로부터 전송되는 데이터를 읽기
		OutputStream os = null;			//클라이언트와 output할 수 있는 스트림
		DataOutputStream dos = null;
		
		try {
			//클라이언트와 통신할 수 있도록 준비
			ServerSocket server = new ServerSocket(12345);
			System.out.println("서버 준비 완료.... 클라이언트의 접속을 기다립니다.");
			//여러 클라이언트에게 서비스 하기 위해서 무한루프
			while (true) {
				client = server.accept();
				InetAddress clientInfo = client.getInetAddress();
				System.out.println("접속한 클라이언트 : " + clientInfo.getHostAddress());
				
				//클라이언트와 통신하기 위한 Input/Output Stream 객체를 소켓으로부터 구한다.
				//InputStream얻기
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//outputStream 얻기
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				//1. 서버 -> 클라이언트(순서가 중요... output을 연속으로 두 번)
				dos.writeUTF(clientInfo.getHostAddress() + "님 접속을 환영합니다.");
				dos.writeInt(20000);
				
				//2. 서버 <- 클라이언트
				String data = dis.readUTF();
				System.out.println("클라이언트가 보낸 메시지 : " + data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
