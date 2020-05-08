package chat.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
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
	
	//=========== 3. User객체에 기존 사용자의 정보를 액세스할 수 있도록 변수를 정의 ===============
	Vector<User> userList;
	//=========================================================================
	public User() {
		
	}
	//========= 4. 서버가 접속한 클라이언트의 정보를 User객체로 만들 때 접속한 User의 소켓객체와 서버뷰, userList를 전달
	public User(Socket socket, ChatServerView serverView, Vector<User> userList) {
		super();
		this.socket = socket;
		this.serverView = serverView;
		this.userList = userList;
		
		ioWork();
		
	}
	//========================================================================================
	
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
			//========== 6. 새로운 클라이언트가 입장을 하면 벡터에 저장되어 있는 모든 클라이언트에게 입장을 알리는 메시지를 보낸다.
			int size = userList.size(); //기존 접속자 인원수
			for (int i = 0; i < userList.size(); i++) {
				userList.get(i).sendMsg("new/" + nickname); //이미 접속한 사용자들한테 안내 - 새로 접속한 사용자의 nickname을 보낸다.
			}
			
			//========== 8. 접속자 리스트에 현재 새로 접속한 클라이언트 정보도 저장 ===========
			userList.add(this);
			//==============================================================
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//===== 7. 클라이언트에게 메시지를 보내는 메서드를 정의 ================================
	public void sendMsg(String message) {
		pw.println(message);
	}
	//=======================================================================
	
	public void run() {
		while(true) {
			try {
				String msg = br.readLine();
				serverView.taclientlist.append(nickname + "이 전송한 메시지: " + msg + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
