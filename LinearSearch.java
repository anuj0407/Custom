package searching;

public class LinearSearch {

	public static boolean search(int[] arr,int data) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==data) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		boolean exist = search(arr,4);
		if(exist) {
			System.out.println("Data found");
		}
		else {
			System.out.println("Data not found");
		}
	}
}
