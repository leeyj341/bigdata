package single.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//서버에서 클라이언트로 데이터를 전송하는 작업을 수행하는 쓰레드
public class ServerSenderThread extends Thread {
	private Socket client;
	
	public ServerSenderThread(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		PrintWriter out;
		BufferedReader keyin;
		try {
			keyin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(client.getOutputStream());
			String sendMsg = "";
			while (true) {
				sendMsg = keyin.readLine();
				if(sendMsg == null) {
					break;
				}
				out.println(sendMsg);
				out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
