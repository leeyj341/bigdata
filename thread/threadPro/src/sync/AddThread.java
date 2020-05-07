package sync;

public class AddThread extends Thread {
	private SharedObj obj;
			
	public AddThread(SharedObj obj) {
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (obj) { //�� �κи� lock�� �����ϰڴٴ� �ǹ�
				long sum = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("�� ���� �ܾ��� ���� " + sum + "���� �Դϴ�.");
			}
		}
	}
}
