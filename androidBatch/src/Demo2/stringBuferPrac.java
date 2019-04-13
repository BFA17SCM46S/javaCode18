package Demo2;

public class stringBuferPrac {
	public static void main(String[] args) {
		StringBuffer sbBuffer = new StringBuffer("hello");
		sbBuffer.append("java");
		System.out.println(sbBuffer);
		sbBuffer.insert(1, "iys very good  ");
		System.out.println(sbBuffer);
		sbBuffer.reverse();
		System.out.println(sbBuffer);
		
		
		
		
	}

}
