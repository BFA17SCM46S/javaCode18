package Demo1;

import javax.security.auth.kerberos.KerberosCredMessage;

public class sessionOne {
	
	private String word;
	private int num;
	private String myNumber = num + "";
	
	
	
	void merge(String word, String myNumber) {
		 for(int i=0, k=0; (i < word.length() && k < myNumber.length()); i++, k++){
	        //System.out.print(word.charAt(i) + "" + myNumber.charAt(k));
	        System.out.print(word.charAt(i) + "" + myNumber.charAt(k));
	        	    
	  }
	}
	
//	void merge(String myNumber, String word) {
//		
//		StringBuilder sBuilder = new StringBuilder();
//		for (int i = 0 ,j=0; i < word.length() && j <  myNumber.length(); i++,j++) {
//			sBuilder.append(word.charAt(j));
//			sBuilder.append(myNumber.charAt(i));
//			
//			
//		}
//		
//		 System.out.println(sBuilder);
//		
//	}
	public static void main(String[] args) {
		sessionOne s = new sessionOne();
		s.merge("nayyar", "123456");
		
	}
	
	
	
}
	

