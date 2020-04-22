package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URL 클래스
//=> 인터넷에서 확인할 수 있는 자원을 추출
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.daum.net");
			System.out.println(url.toString());
			System.out.println("url.getHost()=> " + url.getHost());
			System.out.println("url.getPath()=> " + url.getPath());
			
			//port가 -1
			//-1포트로 접속했다는 의미가 아니라 http의 기본 포트가 80port
			//우리가 접속한 url이 기본 포트를 사용하고 있다는 의미
			System.out.println("url.getPort()=> " + url.getPort());
			System.out.println("url.getProtocol()=> " + url.getProtocol());
			System.out.println("url.getFile()=> " + url.getFile());
			
			//지정한 url에서 자원을 읽어오기 - 한글이 깨진다.
			//Reader의 하위 클래스를 추가해서 읽어오기 - 이미지, 동영상...
			/*InputStream data = url.openStream();
			InputStreamReader isr = new InputStreamReader(data);
			BufferedReader br = new BufferedReader(isr);*/
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while (true) {
				String data_byte = br.readLine();
				if(data_byte == null) {	//스트림의 끝을 만나면 while 빠져나가
					break;
				}
				System.out.println(data_byte);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
