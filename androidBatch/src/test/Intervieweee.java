package test;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;


public class Intervieweee {
//	static int result = 0;
//	public static int  multiplty(int a, int b) {
//		
//		for (int i = 0; i < a; i++) {
//			result += b;			
//		}
//		
//		return result;
//		
//	}
//	public static void main(String[] args) {
//		Intervieweee ee = new Intervieweee();
//		ee.multiplty(8, 9);
//		System.out.println(result);
//		
//		
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println(multiply(5, -3));
		
	
			
		}
	private static int multiply(int x, int y) {
		if (x==0||y==0) {
			return 0;
			
		}else if (y>0) {
			return x + multiply(x, y-1);
			
				
			}else if (y<0) {
				return  -multiply(x, -y);
				
			}else {
				return -1;
			}
			
		
		
	
		
	}
			
		
	}
	
	
	
	


