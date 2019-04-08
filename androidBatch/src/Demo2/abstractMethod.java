package Demo2;

public class abstractMethod extends Bike{

	@Override
	void run() {
		System.out.println("run safe");
		
		
	}
	public static void main(String[] args) {
		Bike bb = new abstractMethod();
		bb.run();
	}

}




abstract class Bike{
	abstract void run();
}