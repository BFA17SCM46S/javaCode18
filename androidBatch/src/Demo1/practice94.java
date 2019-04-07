package Demo1;

public class practice94 {
	void m(practice94 pa) {System.out.println("it is ivoked");}
	
	void p() {m(this);}
	
	public static void main(String[] args) {
		practice94 bbb = new practice94();
		bbb.p();;
		
	}
}
