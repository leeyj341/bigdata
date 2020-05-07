package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//바이너리 데이터를 읽고 쓰지 않는 경우(문자열)
public class MyEchoServer01 {
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
				//클라이언트가 보내오는 데이터를 다시 클라이언트에게 전송
				//클라이언트가 보내오는 데이터를 저장
				String receiveMsg = "";
				while (true) {
					//1. 서버 <- 클라이언트
					receiveMsg = in.readLine();
					if(receiveMsg == null) {
						break;
					}
					//2. 서버 -> 클라이언트
					out.println(receiveMsg + "^^");
					out.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
