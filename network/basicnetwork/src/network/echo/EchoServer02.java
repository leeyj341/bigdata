package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer02 {

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
				
				String receiveMsg = "";
				while (true) {
					receiveMsg = in.readLine();
					if(receiveMsg == null) {
						break;
					}
					switch (receiveMsg) {
					case "안녕하세요?": case "하이":
						out.println(clientInfo.getHostAddress() + "님 반가워요");
						break;

					case "오늘 날짜는":
						out.println("2020-04-27");
						break;
						
					default:
						out.println("~~~님 어여 가~~");
						break;
					}
					out.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
