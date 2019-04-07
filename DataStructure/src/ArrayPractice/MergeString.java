package ArrayPractice;

import java.util.ArrayList;

import javax.swing.InputMap;
import javax.xml.transform.Templates;



public class MergeString {
//	private String word;
//	private int num;
//
//	
//	void merge(String word, int num[]) {
//		
//		int n = num.length;
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.add(word);
//		int m = arrayList.size();
//		
//		ArrayList arrayList2 = new ArrayList();
//		
//		for (int i = 0; i < n-1; i++) {
//			for (int j = 0; j < m-1; j++) {
//				if (i == j) {
//					arrayList2.add(i);
//					arrayList2.add(arrayList.toString());
//					i++;
//					j++;
//				}
//				
//			}
//			
//		}
//		System.out.print(arrayList2);
//		
//	}
//	public static void main(String[] args) {
//		MergeString mString = new MergeString();
//		mString.merge("test",123);
//		
//	}
//	
	
	
//	private int[][] matrix;
//	int row = 4;
//	int columes = 4;
//	
//	void interchange(int matrix[][]){
//		matrix = new int[row][columes];
//		
//		for (int i = 0; i < columes-1; i++) {
//			for (int j = 0; j < row-1; j++)  {
//				 if (i == 0 && i == columes-1) {
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
//		
//	}
//	//public static void main(String[] args) {
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
	
	
//	static int n = 4;
//	
//	//int colms;
//	//swap the first and last element
//	static void interchange1(int m[][]) {
//		int colums = n;
//		for (int i = 0; i < n; i++) {
//			int t = m[i][0];
//			m[i][0] = m[i][n-1];
//			m[i][n-1] = t;
//		}
//	}
//	
//	public static void main(String[] args) {
//		 int m[][] = { { 8, 9, 7, 6 }, 
//                 { 4, 7, 6, 5 }, 
//                 { 3, 2, 1, 8 }, 
//                 { 9, 9, 7, 7 } }; 
//		 interchange1(m);
//		 for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				 System.out.print(m[i][j] + " ");
//				 
//			}
//		  System.out.println();
//		}
//		 	
//	}
	
	
	static void printReverse(String str) {
		//print the first string
		int i;
		for (i = 0; i < str.length() && str.charAt(i) != ' '; i++) {
			System.out.print(str.charAt(i));
			
		}
		// print the middle value
		
		String word = "";
		for (; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word += str.charAt(i);
				
			}else {
				System.out.println(new StringBuilder(word).reverse().toString() + "  ");
				word="";
			}
		}
		//
		System.out.print(word + " ");  
   }
	
	
	
	 public static void main(String []args) {  
	        String str = "Hi how are you geeks";  
	        printReverse(str);  
	    }  
	
	 
	
   
}




















