package sync;

public class Account {
	private String accId;//���¹�ȣ
	private long balance;//�ܾ�
	private String ownerName;//������
	public Account(){
		
	}
	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public void deposit(long amount){//�Ա��ϱ�
		balance = balance+amount;
		System.out.println(amount + "������ �Ա��߽��ϴ�(+)");
	}
	public void withdraw(long amount){//����ϱ�
		balance = balance - amount;
		System.out.println(amount + "������ ����߽��ϴ�(-)");
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getBalance() {
		return balance;
	}
	
}
