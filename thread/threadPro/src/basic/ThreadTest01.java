package basic;
/*
 * ��Ƽ������ ���α׷���
 * 1. ThreadŬ������ ���
 * 2. Run�޼��带 �������̵�
 * 3. ThreadŬ������ (Thread�� ����Ŭ����) start �޼��带 ȣ��
 * 	  => �����۾� ����
 *    => run�� ���� ȣ������ �ʰ� start�޼��带 ȣ���ϸ� 
 *    	 JVM�� ������ �� �ִ� ���°� �Ǿ��� �� �ڵ����� Thread Ŭ������ run�޼��带 ȣ��
*/

class ThreadDemo1 extends Thread {
	public ThreadDemo1(String name) {
		super(name);
	}
	public void run() {
		//1���� 20���� ����ϴ� �ڵ带 �ٸ� �帧�� ���ÿ� �����ϰڴ�.
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + "(" + getName() + ")");
			try {
				Thread.sleep(500); // �����帧�� �����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i % 5 == 0) {
				System.out.println();
			}
			
		}
	}
}
//ThreadDemo01��ü�� Ȱ���Ͽ� ��Ƽ������ ���α׷��� ����
public class ThreadTest01 {

	public static void main(String[] args) {
		System.out.println("******* ���α׷� ���� *******");
		ThreadDemo1 t1 = new ThreadDemo1("t1");
		ThreadDemo1 t2 = new ThreadDemo1("t2");
		//t1.run(); 	-> �ܼ��� �޼��� ȣ��(������ ���α׷����� �� �� ����.)
		t1.start();
		t2.start();
		System.out.println("�۾� ��......");
		for (int i = 1; i <= 10; i++) {
			System.out.println("main");
			try {
				Thread.sleep(200); // �����帧�� �����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("******* ���α׷� ���� *******");
	}

}
