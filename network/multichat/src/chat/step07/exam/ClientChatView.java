package chat.step07.exam;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClientChatView extends JFrame {

	JPanel contentPane;
	JTextField txtinput;
	JTextArea taChat;
	JButton btnsend;
	JList lstconnect;

	String ip;
	int port;
	String nickname;
	Socket socket;

	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	
	OutputStream os;
	PrintWriter pw;

	Vector<String> nicknameList = new Vector<String>();
	StringTokenizer stk;
	
	public ClientChatView(String ip, int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname = nickname;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taChat = new JTextArea();
		taChat.setBounds(12, 10, 501, 375);
		contentPane.add(taChat);
		
		txtinput = new JTextField();
		txtinput.setBounds(12, 395, 378, 35);
		contentPane.add(txtinput);
		txtinput.setColumns(10);
		
		btnsend = new JButton("\uC11C\uBC84\uB85C\uC804\uC1A1");
		btnsend.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);
		
		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY견고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 10, 120, 35);
		contentPane.add(lblNewLabel);
		
		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		//접속한 사용자의 정보가 nicknameList에 저장되어 있고 그 벡터를 JList에 출력
		lstconnect.setListData(nicknameList);

		setVisible(true);
		
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);

		connectServer();
	
	}
	
	
	public void connectServer() {
		try {
			socket = new Socket(ip, port);
			if(socket != null) {
				ioWork();
			}
			//서버한테 nickname 보내기
			sendMsg(nickname);
			nicknameList.add(nickname);
			Thread receiveThread = new Thread(new Runnable() {
				@Override
				public void run() {
					while(true) {
						String msg = "";
						try {
							msg = br.readLine();
							System.out.println("서버가 전달한 메시지 >> " + msg);
							//========= 10. 서버에서 전달된 메시지를 분석하는 메서드 =================
							filteringMsg(msg);
							//==========================================================
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			receiveThread.start();
			//taChat.append(msg + "\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	private void filteringMsg(String msg) {
		stk = new StringTokenizer(msg, "/");
		String protocol = stk.nextToken(); //어떤 작업을 했는지 알 수 있는 키워드
		String message = stk.nextToken();
		System.out.println("프로토콜: " + protocol + ", 메시지: " + message);
		if(protocol.equals("new")) {
			//새로운 사용자가 접속하면 실행되는 부분
			//nicknameList에 추가
			nicknameList.add(message);
			//벡터의 데이터를 새로고침
			lstconnect.setListData(nicknameList);
			//를라이언트 창에 메시지 출력하는 작업
			taChat.append("************** " + message + "님이 입장하셨습니다. ************\n");
		}
		//==== 서버가 전송한 메시지가 기존 클라이언트를 새로운 클라이언트에게 안내하는 경우 =====================
		else if(protocol.equals("old")) {
			nicknameList.add(message);
			lstconnect.setListData(nicknameList);
			taChat.append("************** " + message + "님이 입장하셨습니다. ************\n");
		}
		//==============================================================================
	}
	
	public void ioWork() {
		try {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os, true);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void sendMsg(String message) {
		System.out.println("클라이언트가 서버에게 메시지 전송하기: " + message);
		pw.println(message);
	}
}
