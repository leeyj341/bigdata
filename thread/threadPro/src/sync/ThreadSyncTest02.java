package sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//1. 공유 객체 만들기
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-222-3333",5000,"현빈");
		obj.acc2 = new Account("333-555-7777",1000,"김서연");
		
		//2. 쓰레드 생성하기
		AddThread addT = new AddThread(obj);
		TransferThread transferT = new TransferThread(obj);
		
		//3. 생성한 쓰레드 start 시키기
		addT.start();
		transferT.start();
	}

}
