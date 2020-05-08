package chat.step08;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClientChatListener implements ActionListener{
	ClientChatView view;

	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}

	//버튼을 누를 때, 텍스트 상자에서 엔터키를 입력할 떄 actionPerformed가 호출된다.
	@Override
	public void actionPerformed(ActionEvent e) {
		//========== 1. 채팅대화를 전송하는 경우 protocol, nickname, 대화내용 ===========
		//ActionEvent를 발생시킨 객체가 텍스트필드이거나 버튼이면 실행하라는 의미
		if(e.getSource() == view.txtinput | e.getSource() == view.btnsend) {
			view.sendMsg("chatting/" + view.txtinput.getText().trim() + "/" + view.nickname);
			view.txtinput.setText("");
		}
		
	}
	
	
}
