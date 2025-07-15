package sorting;

public class BubbleSortAlgo {
	// min to max element sequence
	public static void bubbleSortAscendingOrder(int[] arr) {
		boolean swapped;
		for(int i = 0;i<arr.length-1;i++) {
			swapped = false;
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	// max to min element sequence
	public static void bubbleSortDescendingOrder(int[] arr) {
		boolean swapped;
		for(int i = 0;i<arr.length-1;i++) {
			swapped = false;
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
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
		int[] arr = {8,2,4,3,10,42};
		System.out.println("Array in Ascending order:---");
		bubbleSortAscendingOrder(arr);
		displayArrayElements(arr);
		System.out.println("Array in Descending order:---");
		bubbleSortDescendingOrder(arr);
		displayArrayElements(arr);
	}
	
	
	
}
