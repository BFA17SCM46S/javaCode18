package Demo2;

public class Ecapsulation {
	private int age;
	private String name;
	private int rollno;
	
	
	
	public int getAge() {
		
		return age;
		
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}





	public static void main(String[] args) {
		
		Ecapsulation ee =new Ecapsulation();
		ee.setAge(5);
		System.out.println(ee.getAge());
		

	}

}
