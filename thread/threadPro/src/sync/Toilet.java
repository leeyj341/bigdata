package sync;
//공유객체 - 모든 쓰레드가 공유해서 사용하는 객체
public class Toilet {
	/*synchronized() {
		
	}를 이용해서 부분 코드에 lock을 적용할 수 있다.
	*/
	
	//이 메서드는 동기화시키고 있는 메서드이기 때문에 사용하는 동안 lock을 걸겠습니다
	public synchronized void open(String user_name) {
		System.out.println(user_name + "가 문을 열고 들어옴");
		for (int i = 1; i <= 1000000000; i++) {
			if(i == 10000) {
				System.out.println("끙~~~~~~아~~~~~~");
			}
		}
		System.out.println(user_name + "가 종료 후에 나감");
	}
	
	
}
