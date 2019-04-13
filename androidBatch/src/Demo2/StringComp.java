package Demo2;

public class StringComp {
	
	public static void main(String[] args) {
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   String s5 ="Sachin";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println(s1.equalsIgnoreCase(s5));
		   System.out.println(s1 == s2);
		   System.out.println(s1 == s3);
		   System.out.println(s1.compareTo(s5));
		   
		   
	}

}
