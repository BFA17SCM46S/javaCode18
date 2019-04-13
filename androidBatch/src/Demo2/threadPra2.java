package Demo2;



public class threadPra2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i+"  "+currentThread().getName());
			
		}
		
	}
	

	public static void main(String[] args) {
		threadPra2 t2 = new threadPra2();
		threadPra2 t3 = new threadPra2();
		threadPra2 t4 = new threadPra2();
		t2.setName("first thread");
		t3.setName("second thread");
		t4.setName("third thread");
		
		
		t2.start();
		try {
			t2.join(1550);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		t4.start();
		
	}
}
