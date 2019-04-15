package Demo1;



class Table{
	synchronized void printTable(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			
		}
	}
}


class Mythread1 extends Thread{
	Table table1;
	
	public Mythread1(Table table1) {
		this.table1 = table1;
		
	}
	public void run(){  
		table1.printTable(5);  
		}  
	
}

class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  




public class synchronizedPrac {

	public static void main(String[] args) {
		Table obj = new Table();
		Mythread1 t1=new Mythread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}
}






