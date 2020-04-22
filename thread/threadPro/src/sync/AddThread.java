package sync;

public class AddThread extends Thread {
	private SharedObj obj;
			
	public AddThread(SharedObj obj) {
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (obj) { //이 부분만 lock을 적용하겠다는 의미
				long sum = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("두 계좌 잔액의 합은 " + sum + "만원 입니다.");
			}
		}
	}
}
