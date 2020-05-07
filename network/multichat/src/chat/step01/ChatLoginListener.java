package chat.step01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ChatLoginListener  implements ActionListener{
	ChatLogin view;	//이벤트를 발생시키는 화면 ChatLogin
	String nickname;
	public ChatLoginListener(ChatLogin view) {
		super();
		this.view = view;
	}

	//swing에서 버튼이 클릭될 떄 호출되는 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//getId()
		if(e.getSource()==view.btnConnect){
			nickname = view.txtId.getText().trim();
			if(nickname.isEmpty()) {
				JOptionPane.showMessageDialog(view,
						"대화명을 입력하세요", "대화명오류", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String ip = view.cboServer.getSelectedItem()+"";
			int port = Integer.parseInt(view.cboPort.getSelectedItem()+"");
			System.out.println(ip+port);
		}
	}
}