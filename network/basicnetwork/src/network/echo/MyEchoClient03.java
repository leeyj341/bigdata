package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyEchoClient03 {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			socket = new Socket("70.12.115.51", 12345);
			System.out.println("서버접속완료......" + socket);
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			
			out = new PrintWriter(socket.getOutputStream(), true);
		
			keyin = new BufferedReader(
					new InputStreamReader(
							System.in));
			
			System.out.println(in.readLine());
			
			String sendMsg = "";		//서버로 보낼 메시지
			String receiveMsg = "";		//서버에서 받는 메시지
			while ((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg);
				receiveMsg = in.readLine();
				System.out.println("서버가 보내는 메시지: " + receiveMsg);
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
