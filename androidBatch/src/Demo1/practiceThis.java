package Demo1;



public class practiceThis {
	public static void main(String[] args) {
		Student4 s1 = new Student4(111,"ankit",5000f);
		Student4 s2 = new Student4(111,"ankit",5000f);
		s1.display();
		s2.display();
		
	}

}

class Student4{
	int rollno;
	String name;
	float fee;
	public Student4(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	
}
