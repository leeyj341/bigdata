package chat.step09;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChatLogin extends JFrame {

	 JPanel contentPane;
	 JTextField txtId;
	 JComboBox cboServer;
	 JComboBox cboPort;
	 JButton btnConnect;
	 String[] ip = {"70.12.116.62", "70.12.116.65", "70.12.116.50", "127.0.0.1"};
	 String[] port = {"12345"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatLogin frame = new ChatLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//이클립스 플러그인 window builder툴을 설치하고 드래그 앤 드랍으로 화면 디자인 한 것
	public ChatLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Server_IP");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setBounds(38, 107, 152, 30);
		contentPane.add(lblNewLabel);
		
		cboServer = new JComboBox(ip);
		cboServer.setBounds(37, 141, 238, 30);
		contentPane.add(cboServer);
		
		JLabel lblServerport = new JLabel("Server_port");
		lblServerport.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblServerport.setBounds(38, 196, 152, 30);
		contentPane.add(lblServerport);
		
		cboPort = new JComboBox(port);
		cboPort.setBounds(38, 228, 238, 30);
		contentPane.add(cboPort);
		
		btnConnect = new JButton("\uC11C\uBC84\uC811\uC18D");
		btnConnect.setFont(new Font("HY견고딕", Font.BOLD, 18));
		btnConnect.setBounds(103, 371, 172, 51);
		contentPane.add(btnConnect);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblId.setBounds(38, 275, 152, 30);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(38, 302, 238, 38);
		contentPane.add(txtId);
		txtId.setColumns(10);
		startevent();
	}

	private void startevent() {
		ChatLoginListener listener = new ChatLoginListener(this);
		btnConnect.addActionListener(listener);
		
	}
	
}
