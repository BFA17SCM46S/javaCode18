package Demo2;

public class TestingQue {
	static int arr[] = {2,32,14,25,14,40,1,100};
	
	static int largest() {
		int i;
		int max = arr[0];
		
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	static int smallest() {
		int i;
		int min =arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
				
			}	
		}
		return min;	
	}
	
	public static void main(String[] args) {
		System.out.println("largest is " + largest());
		System.out.println("smallest is  "+ smallest());
	}
	
	

}
