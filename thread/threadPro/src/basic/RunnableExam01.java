package basic;

class DigitThread2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "(" + Thread.currentThread().getName() + ")\t");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
	
}

class AlphaThread2 implements Runnable {
	
	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + "(" + Thread.currentThread().getName() + ")\t");
		}
		
	}
	
}

public class RunnableExam01 {

	public static void main(String[] args) {
		DigitThread2 d1 = new DigitThread2();
		AlphaThread2 a1 = new AlphaThread2();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(a1);
		
		t1.start();
		t2.start();

	}

}
