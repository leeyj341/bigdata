package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyEchoServer03 {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
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
				keyin = new BufferedReader(
						new InputStreamReader(
								System.in));
				
				out = new PrintWriter(client.getOutputStream());
				
				out.println("안녕하세요 클라이언트님?");
				out.flush();
				
				String sendMsg = "";
				String receiveMsg = "";
				while (true) {
					receiveMsg = in.readLine();
					System.out.println("클라이언트가 보낸 메시지: " + receiveMsg);
					if(receiveMsg == null) {
						break;
					}
					sendMsg = keyin.readLine();
					out.println(sendMsg);
					out.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
