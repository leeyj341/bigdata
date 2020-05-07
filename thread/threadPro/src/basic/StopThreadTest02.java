package basic;
/*
 * 쓰레드 종료
 * 2. 인터럽트를 발생시키고 현재 상태를 확인해 작업하기
 * 	  => isInterrupted()메서드를 이용해서 현재 쓰레드의 상태가 인터럽트 상태인지 파악
 * 		  인터럽트 상태면 true를 리턴
*/
class StopThread02 implements Runnable {
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("현재 쓰레드 상태: 실행 중 ~~~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {

		} finally {
			System.out.println("현재 쓰레드 상태: 종료 ~~~~~");
		}
		
	}
	
}

public class StopThreadTest02 {

	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		Thread t1 = new Thread(new StopThread02());
		t1.start();
		System.out.println("쓰레드의 이름: " + t1.getName());
		System.out.println("인터럽트 상태: " + t1.isInterrupted());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//인터럽트 발생...
		t1.interrupt();
		System.out.println("인터럽트 상태: " + t1.isInterrupted());
		System.out.println("main쓰레드 종료");
	}

}
