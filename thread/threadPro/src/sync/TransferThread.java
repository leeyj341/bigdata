package sync;

public class TransferThread extends Thread {
	private SharedObj obj;
	
	public TransferThread(SharedObj obj) {
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (obj) {
				obj.acc1.withdraw(100);
				obj.acc2.deposit(100);
			}	
		}
	}
}
