package chat.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

public class User extends Thread {
	//ChatServerView에서 넘겨받을 데이터
	Socket socket;
	ChatServerView serverView;
	
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	 
	OutputStream os;
	PrintWriter pw;
	
	String nickname;
	
	String message;
	
	Vector<User> userList;
	
	StringTokenizer stk;
	public User() {
		
	}
	public User(Socket socket, ChatServerView serverView, Vector<User> userList) {
		super();
		this.socket = socket;
		this.serverView = serverView;
		this.userList = userList;
		
		ioWork();
		
	}
	
	//접속한 클라이언트와 서버가 통신할 수 있도록 스트림객체 생성
	public void ioWork() { //처음 접속했을 때 한 번 실행되는 메서드
		try {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os, true);
			
			//클라이언트와 통신할 수 있는 스트림을 생성하고 클라이언트가 입장하면 클라이언트가 전송하는 nickname을 읽어서
			//서버창에 출력하기
			nickname = br.readLine();
			serverView.taclientlist.append("*****************" + nickname + "님이 입장 ****************\n");
			
			//======== 기존의 for문을 메서드 호출문으로 변경 ======================
			//기존 클라이언트에게 새로운 접속자가 있음을 알려주는 부분
			letUsersKnow("new/");
			//======== 새로운 접속자(this)에게 기존 클라이언트의 정보를 알려주기 ========
			letUsersKnow("old/");
			
			userList.add(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//============ 3. 클라이언트에게 전달된 메시지를 분석하는 메서드 ====================
	private void filteringMsg(String msg) {
		stk = new StringTokenizer(msg, "/");
		String protocol = stk.nextToken(); //어떤 작업을 했는지 알 수 있는 키워드
		
		if (protocol.equals("chatting")) {
			String message = stk.nextToken();
			String sendNickname = stk.nextToken();
			
			letUsersKnow("chatting/" + message + "/" + sendNickname);
		}
	}
	
	private void letUsersKnow(String protocol) {
		int size = userList.size(); //기존 접속자 인원수
		for (int i = 0; i < size; i++) {
			if(protocol.equals("new/")) {
				userList.get(i).sendMsg(protocol + nickname); //이미 접속한 사용자들한테 안내 - 새로 접속한 사용자의 nickname을 보낸다.
			}
			else if(protocol.equals("old/")) {
				this.sendMsg(protocol + userList.get(i).nickname);
			}
			else {
				userList.get(i).sendMsg(protocol);
			}
		}
	}
	
	
	public void sendMsg(String message) {
		pw.println(message);
	}
	
	public void run() {
		while(true) {
			try {
				String msg = br.readLine();	
				serverView.taclientlist.append(nickname + " >> " + msg + "\n");
				//===== 4. 서버가 수신한 메시지를 바로 벡터에 저장된 클라이언트들에게 보낼 수 있도록 메서드 호출
				filteringMsg(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
