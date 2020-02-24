package pattern.exam;

import java.util.regex.Pattern;

// 8글자 이상, 대문자, 소문자, 특수문자, 숫자가 모두 포함
public class PasswordCheck {

	public static boolean isPass(String str) {
		String passreg="[A-z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\-\\+\\=\\/\\?\\.\\>\\,\\<\\'\"\\:\\;\\{\\}\\[\\]]+";
		return Pattern.matches(passreg, str);
	}
	
	public static void main(String[] args) {
		System.out.println(isPass("!@#FDSFF45"));//false
    	System.out.println(isPass("함낭ㄱ2313@@#"));//false
    	System.out.println(isPass("gfaskjdalkjd"));//false
    	System.out.println(isPass("ERQfasf"));//false
    	System.out.println(isPass("@@@##$#$!"));//false
    	System.out.println(isPass("!#eD123"));//false
    	System.out.println(isPass("!@#deED123"));//true

	}

}
