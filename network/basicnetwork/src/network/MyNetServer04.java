package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//바이너리 데이터를 읽고 쓰지 않는 경우(문자열)
public class MyNetServer04 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("서버접속완료.......");
			while (true) {
				client = server.accept();
				InetAddress clientInfo = client.getInetAddress();
				System.out.println("접속한 클라이언트 : " + clientInfo.getHostAddress());
				
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				
				out = new PrintWriter(client.getOutputStream());
				
				//*******통신 시작********
				//1. 서버 -> 클라이언트
				out.println("클라이언트님 접속 성공");
				//출력하기 위한 데이터를 출력버퍼에 임시로 쌓았다가 스트림으로
				//출력되기 위해서 버퍼에 쌓여있는 데이터를 내보내는 작업
				//flush는 버퍼를 비우는 명령어
				out.flush();
				
				//2. 서버 <- 클라이언트
				String msg = in.readLine();
				System.out.println("클라이언트가 전송한 메시지: " + msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
