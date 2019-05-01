package Demo2;

public class balancedParethesis {
	
	static class Stack{
		int top = -1;
		char items[] = new char[100]; 
		  
		
	void push(char x) {
		if (top == 99) {
			System.out.println("stack is full");
			
		}else {
			items[++top] = x;
		}
		
	}
	
	
	char popup(){
		if(top == -1) {
			System.out.println("not more to pop");
			
			return '\0';
			
		}else {
			char elemnt = items[top];
			top--;
			return elemnt;	
			
		}
	
	}
	
	boolean isEmpty() {
		
	
		return (top ==-1)? true:false;
	
	}
	
	
}
	
	
	
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '('&&character2==')') {
			
			return true;
		}else if (character1 == '['&&character2==']'){

			return true;
		}else if(character1 == '{'&&character2=='}'){

			return true;
		}else {

			return false;
		}

	} 
	
	static boolean areParenthesisBalanced(char exp[]) {
		Stack stack = new Stack();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
				stack.push(exp[i]);
			
			
			
			
		    if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
		    	 if (stack.isEmpty()) {
			    		return false;
						
					}else if (!isMatchingPair(stack.popup(), exp[i])) {
						return false;
					} 
		    
	}
		    
		   
}

		if (stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

	
	
	public static void main(String[] args) {
		
		char exp[] = {'{','(',')','}','[',']',')'}; 
		if (areParenthesisBalanced(exp)) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
		
}
	
	
}
