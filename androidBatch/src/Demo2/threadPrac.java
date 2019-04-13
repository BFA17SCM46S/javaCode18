package Demo2;

public class threadPrac extends Thread{
	@Override
	public void run() {
		
		System.out.println("threading is running");
	}

	public static void main(String[] args) {
		threadPrac t1 = new threadPrac();
		t1.start();
		

	}

}
