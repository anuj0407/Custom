package searching;

public class BinarySearch {

	public static boolean search(int data, int[] arr) {
		int left = 0;// or low
		int right = arr.length-1;// or high		
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(arr[mid] == data) {
				return true;
			}
			else if(arr[mid] < data) {
				left = mid+1;
			}
			else {
				right = mid - 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		boolean exist = search(4,arr);
		if(exist) {
			System.out.println("Data found");
		}
		else {
			System.out.println("Data not found");
		}
	}
}
