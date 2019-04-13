package Demo2;



public class classpractice {
	
	static char[] letters;
 	public static String reverse(String str) {
		
	
		str.replace('a', '1');
		str.replace('e', '2');
		str.replace('i', '3');
		str.replace('o', '4');
		str.replace('u', '5');

		return str;

	}

	public static void main(String[] args) {
		String input = "Hello World!";
		
		
//		String s1 = "Hello World";
//        String s2 = s1.replaceAll("a", "1")
//        		.replace("e", "2").replace("i", "3")
//        		.replace("o", "4").replace("u", "5");
//        System.out.println(s2);
//        
//        String token = s2.replace("y", " ");
//        String token1 = token.replace(" ", "y");
//        String token3 = token1.toLowerCase();
//        
//        String my_new_str = token3.replace("&", "&amp;");
//        System.out.println(token3); 
//        
		letters = input.toCharArray();
		for (char c : letters) {
			isVowel(c);
			isConsonant(c);
			isSpecialChar(c);
			
			
		}
		
		
       
        
	}
	public static void isY() {}
	public static void isSpace() {}

	private static void isSpecialChar(char c) {
		
	}

	private static void isConsonant(char c) {
		String s = String.valueOf(c);
		if (s.matches("[a-z&&[^aeiou]]")) {
			System.out.println("constant---" + c);
	}
}

	private static void isVowel(char c) {
		String s = String.valueOf(c);
		if (s.matches("[aeiou]")) {
			System.out.println("vowel---" + c);
			
			
		}
		
	}

}
