package Demo2;

public class javaDeamon extends Thread {
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work");  
			  }  
			  else{  
			  System.out.println("user thread work");  
			 }  
	}  
	

	public static void main(String[] args) {
		javaDeamon t2 = new javaDeamon();
		javaDeamon t3 = new javaDeamon();
		javaDeamon t4 = new javaDeamon();
		
		t4.setDaemon(true);
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
