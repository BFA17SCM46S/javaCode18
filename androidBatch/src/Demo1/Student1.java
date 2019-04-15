package Demo1;



class Student2{  
	int rollno;  
	String name;  
	void insertRecord(int r, String n){  
		rollno=r;  
		name=n;  
	}  
	void displayInformation(){
		int c = add(10, 20);
		System.out.println(rollno+" "+name);
		
	}  
	
	public int add(int a, int b) {
		System.out.println("sum is "+a+b);
		return a+b;
		
	}
	

	
	
	

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}  





class Student1{  
	public static void main(String args[]){  
		Student2 s1=new Student2();  
		Student2 s2=new Student2();  
		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  
		s1.displayInformation();  
		s2.displayInformation();  
	}  
} 