package Demo1;

public class mergeString {

	
	public static String merge(String s1, String s2) {
		int i =0 , j = 0; 
		StringBuilder resultString = new StringBuilder();  
		while (i<s1.length()&&j<s2.length()) {
			resultString.append(s1.charAt(i++));
			resultString.append(s2.charAt(j++));
			
		}
		
		
	
		if (i!=s1.length()) {
			resultString.append(s1.substring(i));
		}
		if (j!=s2.length()) {
			resultString.append(s2.substring(j));
		}
		
		
		
		
//		for ( i = 0;  i< s1.length(); i++) {
//			for ( j = 0; j < s2.length(); j++) {
//				resultString.append(s1.charAt(i));
//				resultString.append(s2.charAt(j));
//				
//				
//				
//			}
//			
//		}
		
		
		
		return resultString.toString();
		
		
		
	}
	
	public static void main(String[] args) {
		String s1 = "hello"; 
        String s2 = "worldddd"; 
        System.out.println(merge(s1, s2));
        
	}
	
}

