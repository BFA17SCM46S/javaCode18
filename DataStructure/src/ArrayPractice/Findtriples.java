package ArrayPractice;

public class Findtriples {
	static int count(int n) {
		
		
		int ans = 0;
		for (int i = 1; i < n-1; i++) {
			for (int j = i+1; j < n-1; j++) {
				int x = i * i + j * j;
				
				int y = (int) Math.sqrt(x);
				if (y*y == x && y<=n) {
    				++ans;
					
				}
			}
		}
		return ans;
	}
	public static void main(String args[]) {  
	  
	    int n = 10;  
	  
	    
	    System.out.println(count(n));  
	  
	}  
	
//	
//	static int Triplets(int n)  
//	{  
//	    // to store required answer  
//	    int ans = 0;  
//	  
//	    // run nested loops for first two numbers.  
//	    for (int i = 1; i <= n; ++i) {  
//	        for (int j = i; j <= n; ++j) {  
//	            int x = i * i + j * j;  
//	  
//	            // third number  
//	            int y =(int) Math.sqrt(x);  
//	  
//	            // check if third number is perfect  
//	            // square and less than n  
//	            if (y * y == x && y <= n)  
//	                ++ans;  
//	        }  
//	    }  
//	  
//	    return ans;  
//	}  
//	  
//	// Driver code  
//	public static void main(String args[]) 
//	{  
//	  
//	    int n = 10;  
//	  
//	    // function call  
//	    System.out.println(Triplets(n));  
//	  
//	}  
	
	
	
}

