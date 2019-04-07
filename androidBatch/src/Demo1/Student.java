package Demo1;



public class Student {
	int ID;
	String Name;
	
	void insertValue(int n, String r) {
		ID = n;
		Name = r;
		int a =10;
		int b = 20;
		int c = a+b;
	}
	
	void disPlay() {
		System.out.println("name is "+Name+"id is "+ ID);
	}

	public static void main(String[] args) {
		Student s1= new Student();
		s1.insertValue(8, "wde");
		s1.disPlay();

	}

}
