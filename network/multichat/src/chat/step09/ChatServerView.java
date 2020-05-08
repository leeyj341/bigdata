package chat.step09;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class ChatServerView extends JFrame {

	 JPanel contentPane;
	 JTextArea taclientlist;
	 JButton btnchangeport;
	 JButton btnstartServer;
	 JButton btnstop;
	 
	 ServerSocket server;
	 Socket socket;
	 
	 Vector<User> userList = new Vector<User>();
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerView frame = new ChatServerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChatServerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taclientlist = new JTextArea();
		taclientlist.setBounds(12, 50, 472, 415);
		contentPane.add(taclientlist);
		
		JScrollPane scroll = new JScrollPane(taclientlist);
		scroll.setBounds(12, 50, 472, 415);
		contentPane.add(scroll);
		
		JLabel label = new JLabel("\uC811\uC18D\uC790:");
		label.setFont(new Font("HY견고딕", Font.BOLD, 14));
		label.setBounds(12, 10, 120, 35);
		contentPane.add(label);
		
		btnchangeport = new JButton("\uD3EC\uD2B8\uBCC0\uACBD");
		btnchangeport.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnchangeport.setBounds(516, 50, 129, 35);
		contentPane.add(btnchangeport);
		
		btnstartServer = new JButton("\uC11C\uBC84\uC2DC\uC791");
		btnstartServer.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstartServer.setBounds(516, 95, 129, 35);
		contentPane.add(btnstartServer);
		
		btnstop = new JButton("\uC11C\uBC84\uC911\uC9C0");
		btnstop.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnstop.setBounds(516, 140, 129, 35);
		contentPane.add(btnstop);
		btnstartServer.addActionListener(new ChatServerListener(this));
		btnstop.addActionListener(new ChatServerListener(this));
	}
	
	public void serverStart(int port) {
		try {
			server = new ServerSocket(port);
			taclientlist.append("사용자 접속 대기중\n");
			if(server != null) {
				//클라이언트의 접속을 기다리는 처리
				connection();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

	public void connection() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						socket = server.accept();
						String ip = socket.getInetAddress().getHostAddress();
						taclientlist.append(ip + " 사용자 접속!!!\n");
						
						//클라이언트의 연결 부분
						//=> 클라이언트가 접속하면 클라이언트의 정보를 User객체로 생성해서 
						//	  독립적인 실행흐름을 가질 수 있도록 Thread로 실행
						User user = new User(socket, ChatServerView.this, userList);
						user.start();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}// end while
			}
		});
		thread.start();
	}

	
}






