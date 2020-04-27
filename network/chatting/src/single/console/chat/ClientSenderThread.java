package single.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSenderThread extends Thread {
	private Socket socket;	
	
	public ClientSenderThread(Socket socket) {
		this.socket = socket;
	}
	
	//키보드로 입력한 내용을 서버로 보내는 작업
	@Override
	public void run() {
		PrintWriter out;              
		BufferedReader keyin;         
		try {
			out = new PrintWriter(socket.getOutputStream());
			keyin = new BufferedReader(new InputStreamReader(System.in));
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
