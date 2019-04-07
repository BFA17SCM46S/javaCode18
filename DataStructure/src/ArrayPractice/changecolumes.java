package ArrayPractice;

public class changecolumes {

//	 int[][] matrix;
//	int row = 4;
//	int columes = 4;
//	
//	void interchange(int matrix[][]){
//		matrix = new int[row][columes];
//		
//		for (int i = 0; i < columes; i++) {
//			for (int j = 0; j < row; j++)  {
//				 if (i == 0 && i == columes) {
//					 swap(i,j);
//					
//				}
//			}
//			
//		}	
//	}
//	
//	void swap(int x, int y) {
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;
//		
//	}
//	public static void main(String[] args) {
//		 int[][] array2d = { 
//                 { 1,4,6,7,43},
//                 { 5,6,3,12,8},
//                 { 12,4,87,35,11 }
//               };
//		 MergeString mgMergeString = new MergeString();
//		 System.out.println("real aar"+ array2d);
//		 mgMergeString.interchange(array2d);
//		 System.out.println("after merged"+ array2d);
//	}
//	
	
	
	static int n = 4; 
	  
	static void interchangeFirstLast(int m[][]) 
	{ 
	    int cols = n; 
	  
	    // swapping of element between first 
	    // and last columns 
	    for (int i = 0; i < n; i++) { 
	        int t = m[i][0]; 
	        m[i][0] = m[i][n - 1]; 
	        m[i][n - 1] = t; 
	    } 
	} 
	  
	// Driver function 
	  
	    public static void main (String[] args) { 
	            // input in the array 
	    int m[][] = { { 8, 9, 7, 6 }, 
	                    { 4, 7, 6, 5 }, 
	                    { 3, 2, 1, 8 }, 
	                    { 9, 9, 7, 7 } }; 
	  
	    interchangeFirstLast(m);
	    
	  
	    // printing the interchanged matrix 
	    for (int i = 0; i < n; i++) { 
	        for (int j = 0; j < n; j++) 
	            System.out.print(m[i][j] + " "); 
	            System.out.println();
	        
	            
	    } 
	 } 

}
