package sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//1. ���� ��ü �����
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-222-3333",5000,"����");
		obj.acc2 = new Account("333-555-7777",1000,"�輭��");
		
		//2. ������ �����ϱ�
		AddThread addT = new AddThread(obj);
		TransferThread transferT = new TransferThread(obj);
		
		//3. ������ ������ start ��Ű��
		addT.start();
		transferT.start();
	}

}
