package Demo1;

public class practice91 {
	
	void m() {System.out.println("hello m");}
	void n(){
		System.out.println("hello n");
		this.m();

}
	
	public static void main(String[] args) {
		practice91 aPractice91  = new practice91();
		aPractice91.n();
		}
	

}
