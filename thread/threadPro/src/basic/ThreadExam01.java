package basic;

class DigitThread extends Thread {
	
	public DigitThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "(" + getName() + ")\t");
		}
		
	}
	
}

class AlphaThread extends Thread {
	
	public AlphaThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + "(" + getName() + ")\t");
		}
		
	}
	
}

public class ThreadExam01 {

	public static void main(String[] args) {
		DigitThread d1 = new DigitThread("digit");
		AlphaThread a1 = new AlphaThread("a1");
		
		d1.start();
		a1.start();

	}

}
