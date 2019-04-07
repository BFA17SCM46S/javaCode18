package test;

public class tryDemo {
	public static void main(String[] args) {
		int number = 0;
		try {
			number = Integer.parseInt(args[0]);
			System.out.println("can you see?");
		} catch (Exception e) {
			System.out.println("illegal inut");
		}
		
		System.out.println("the result is  " + number);
	}

}
