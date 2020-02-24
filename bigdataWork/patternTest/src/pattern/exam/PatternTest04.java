package pattern.exam;

import java.util.regex.Pattern;

public class PatternTest04 {
	public static void main(String[] args) {
		/*System.out.println(Pattern.matches("[0-9]+", "1234java"));
		System.out.println(Pattern.matches("[0-9]+", "java"));
		System.out.println(Pattern.matches("[0-9]+", "1234"));
		System.out.println(Pattern.matches("[0-9]+", "1"));
		System.out.println(Pattern.matches("[0-9]+", " "));*/
		
		System.out.println(Pattern.matches("[0-9]?", "1234java"));
		System.out.println(Pattern.matches("[0-9]?", "java"));
		System.out.println(Pattern.matches("[0-9]?", "1234"));
		System.out.println(Pattern.matches("[0-9]?", "1"));
		System.out.println(Pattern.matches("[0-9]?", ""));
	}

}
