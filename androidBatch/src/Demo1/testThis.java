package Demo1;

public class testThis {

	public static void main(String[] args) {
		A a = new A(10);
		
	}

}


class A{  
	A(){System.out.println("hello a");}  
	A(int x){  
		this();  
		System.out.println(x);  
	}  
}  