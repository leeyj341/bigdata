package basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress - IP를 표현하기 위한 객체
public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("ia.getHostName()=> " + ia.getHostName());
			System.out.println("ia.getHostAddress()=> " + ia.getHostAddress());
			System.out.println("InetAddress.getLocalHost()=> " + InetAddress.getLocalHost());
			
			InetAddress[] arrIa = InetAddress.getAllByName(args[0]);
			
			for (int i = 0; i < arrIa.length; i++) {
				System.out.println("arrIa[" + i + "].getHostName()=> " + arrIa[i].getHostName());
				System.out.println("arrIa[" + i + "].getHostAddress()=> " + arrIa[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
