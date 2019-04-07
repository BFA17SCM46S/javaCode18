package ArrayPractice;

public class binarysearch {
	int binarySearch(int array[], int l,int r, int x) {
		
		if (r>1||r>l) {
			int mid = l + (r-l)/2;
			if (array[mid]==x) 
				return array[mid];
				
			
			if (array[mid] > x) 
				return binarySearch(array, l, mid-1, x);
			
			if (array[mid] > x) 
				return binarySearch(array, mid+1, r, x);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		binarysearch bs = new binarysearch();
		int arr [] = {2,3,4,10,11,20,67,89};
		int n = arr.length;
		int x = 10;
		int result = bs.binarySearch(arr,0,n-1,x);
		if (result==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index " + 
					result); 
		}
		
		
	}
}
