package ArrayPractice;



public class Demo1{

	
	
	public static void evenodd(int[] A) {
		int nextevent = 0, nextodd= A.length-1;
		while(nextevent < nextodd) {
			if(nextevent % 2 == 0) {
				nextevent++;
			}else {
				int temp = A[nextevent];
				A[nextevent] = A[nextodd];
				A[nextodd--] = temp;
						
		}	
	}
}
}	
	