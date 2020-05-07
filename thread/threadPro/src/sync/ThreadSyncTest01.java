package sync;

public class ThreadSyncTest01 {
	public static void main(String[] args) {
		//모든 쓰레드가 공유해서 사용할 객체
		Toilet toilet = new Toilet();
		
		//공유 객체를 사용하는 쓰레드 객체를 생성
		User user1 = new User("장동건", toilet);
		User user2 = new User("공유", toilet);
		User user3 = new User("하정우", toilet);
		User user4 = new User("현빈", toilet);
		User user5 = new User("류준열", toilet);
		User user6 = new User("안정환", toilet);
		User user7 = new User("이동욱", toilet);
		
		//Thread 시작
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
	}

}
