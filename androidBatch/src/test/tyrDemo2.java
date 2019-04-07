package test;

import java.util.Arrays;



public class tyrDemo2 {
	int arr[] = {1,2,4,6,3,1};
	int temp = -1;
	public void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j  = 0;  j< arr.length; j++) {
				if (arr[i] < arr[j] ) {
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		tyrDemo2 ty = new tyrDemo2();
		ty.sort();
		
	}
}
