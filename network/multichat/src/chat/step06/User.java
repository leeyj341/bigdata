package chat.step06;
//======= 3. multi채팅을 구현하기 위해서 모든 클라이언트의 정보를 저장(서버에서 모든 클라이언트 정보를 갖고 있어야 한다.)
//			  클라이언트의 정보 클라이언트의 처리를 표현한 User클래스를 작성 =============================
//			  클라이언트와 서버가 통신할 수 있는 객체
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

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
	
	public User() {
		
	}
	//서버가 접속한 클라이언트의 정보를 User객체로 만들 때 접속한 User의 소켓객체와 서버뷰를 전달
	public User(Socket socket, ChatServerView serverView) {
		super();
		this.socket = socket;
		this.serverView = serverView;
		
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//쓰레드로 처리할 작업 - 접속한 클라이언트가 전송하는 메시지를 계속 받아서 서버창에 출력
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
