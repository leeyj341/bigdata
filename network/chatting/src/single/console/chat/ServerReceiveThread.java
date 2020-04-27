package single.console.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiveThread extends Thread {
	private Socket client;
	
	public ServerReceiveThread(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String msg = "";
			while (true) {
				msg = in.readLine();
				if(msg == null) {
					break;
				}
				System.out.println("클라이언트 >> " + msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
