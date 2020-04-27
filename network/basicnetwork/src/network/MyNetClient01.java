package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {
	public static void main(String[] args) {
		//서버와 통신할 수 있는 소켓객체를 생성
		Socket socket;
		try {
			socket = new Socket("70.12.115.51", 12345);
			System.out.println("서버접속완료...." + socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
