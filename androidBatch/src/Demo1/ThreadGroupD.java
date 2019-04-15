package Demo1;

public class ThreadGroupD implements Runnable {

	public static void main(String[] args) {
		ThreadGroupD run = new ThreadGroupD();
		ThreadGroup group = new ThreadGroup("parent");
		
		Thread t1 = new Thread(group,run,"one");
		t1.start();
		Thread t2 = new Thread(group,run,"two");
		t2.start();
		Thread t3 = new Thread(group,run,"three");
		t3.start();
		
		System.out.println("Thread Group Name: "+group.getName());
		group.list();
		
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
