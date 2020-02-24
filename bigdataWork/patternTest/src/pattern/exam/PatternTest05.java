package pattern.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest05 {
	public static void main(String[] args) {
		//String str = "tomato jaava tomato prog potato";
		//String str = "aaaaa aaabc iiiii iiibc aiabc";
		String str = "adsf111 a1 b5 b55 aaa5 qa5 5a";
		
		//String patternStr = "(tom|pot)ato";		//숫자를 뺀 나머지
		//String patternStr = "(a|i){3}bc";
		String patternStr = "([a-z]+[0-9]+)";
		
		equalsPattern(str, patternStr);
	}
	public static void equalsPattern(String str, String patternStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher m = pattern.matcher(str);
		
		while (m.find()) {
			System.out.println(m.group());
			System.out.println(m.start() + " : " + (m.end() - 1));
		}
	}
}
