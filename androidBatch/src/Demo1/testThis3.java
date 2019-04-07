package Demo1;

public class testThis3 {

	public static void main(String[] args) {
		Student5 s1=new Student5(121,"ankit",5000f);  
		Student5 s2=new Student5(112,"sumit",6000f);  
		s1.display();  
		s2.display();  

	}

}



class Student5{  
	int rollno;  
	String name;  
	float fee;  
	Student5(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
	}  
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  