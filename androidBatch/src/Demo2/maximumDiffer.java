package Demo2;



public class maximumDiffer {
	static int currentdeffer = 0;
	static int maximundiifer  = 0;
	
	
	int maxiDiffer(int arr[], int size) {
		 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
			 if (arr[i]>arr[j]) {
				 currentdeffer = arr[i] - arr[j];
				 if (currentdeffer>maximundiifer) {
					 maximundiifer = currentdeffer;
			
				}	
			}
			}
			
		}
		 return maximundiifer; 
		
		
		
	}

	public static void main(String[] args) {
		int arr[] = {12,6,24, 98,54,112};
		maximumDiffer max= new maximumDiffer();
		
        System.out.println("Maximum differnce is " +  max.maxiDiffer(arr, 5));
		
	}

}

//define the array its size 




