package ArrayPractice;

import java.util.function.IntToDoubleFunction;

public class qiuckOsrt {
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int j = 0; j < high; j++) {
			if(arr[j]<=pivot) {
				i++;
				
				//swap i and i
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;	
	}
	void sort(int arr[], int low, int high) {
		if (low < high) {
			
			int pi = partition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
			
		}
	}
	 static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]+"  ");
		}	
	}	 
	 public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		qiuckOsrt QS = new qiuckOsrt();
		
		QS.sort(arr, 0, n-1);
		System.out.println("soted array");
		printArray(arr);
	
	}
}

















