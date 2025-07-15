package sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key; 
		}
	}
	
	public static void displayArrayElements(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,2,6,1};
		System.out.println("Before Insertion sort:-");
		displayArrayElements(arr);
		insertionSort(arr);
		System.out.println("After Insertion sort:-");
		displayArrayElements(arr);
	}
	
}
