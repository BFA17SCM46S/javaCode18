package Demo2;

public class superKword {

	public static void main(String[] args) {
		Dogg d=new Dogg();  
		d.work(); 
	}

}


class Animall{  
	void eat(){
		System.out.println("eating...");
		}  	
}  


class Dogg extends Animall{  
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	
	
	void work(){  
	super.eat();  
	bark();  
	}
	
}  