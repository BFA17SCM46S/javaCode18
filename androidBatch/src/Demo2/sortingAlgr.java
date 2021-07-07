package Demo2;

public class sortingAlgr {


	void Sorting(int arr[]){ 
		\\int n = arr.length;       \\I think you this variable is not needed
		for (int i = 0; i < arr.length-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) { 

					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 
	void PrintArray(int arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + "   "); 
		System.out.println(); 
	}

   
	public static void main(String[] args) {
		sortingAlgr sorting = new sortingAlgr();
		int arr[] = {3, 14, 65, 18, 23, 9, 190}; 
		sorting.Sorting(arr);
		sorting.PrintArray(arr);
		
	}


}
