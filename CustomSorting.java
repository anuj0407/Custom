package sorting;

public class CustomSorting {

	//Custom sorting in descending order
	public static int maxIndex(int[] dataArr ,boolean[] trackData) {
		int max = Integer.MIN_VALUE;
		int maxIdx = -1;
		for(int i = 0 ;i<dataArr.length;i++) {
			if(!trackData[i] && dataArr[i] > max) {
				max = dataArr[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	} 
	
	public static int[] sortingMaxToMIN(int[] dataArr) {
		boolean[] trackData = new boolean[dataArr.length];
		int[] sorted = new int[dataArr.length];
		for(int i = 0;i<dataArr.length;i++) {
			int maxIdx = maxIndex(dataArr,trackData);
			trackData[maxIdx] = true;
			sorted[i] = dataArr[maxIdx];
		}
		return sorted;
	}
	
	//Custom sorting in ascending order
	public static int minIndex(int[] dataArr ,boolean[] trackData) {
		int min = Integer.MAX_VALUE;
		int minIdx = -1;
		for(int i = 0 ;i<dataArr.length;i++) {
			if(!trackData[i] && dataArr[i] < min) {
				min = dataArr[i];
				minIdx = i;
			}
		}
		return minIdx;
	}
	
	public static int[] sortingMinToMax(int[] dataArr) {
		boolean[] trackData = new boolean[dataArr.length];
		int[] sorted = new int[dataArr.length];
		for(int i = 0;i<dataArr.length;i++) {
			int minIdx = minIndex(dataArr,trackData);
			trackData[minIdx] = true;
			sorted[i] = dataArr[minIdx];
		}
		return sorted;
	}
	
	
	//function to display element of an array from indexing 0 to array length 
	public static void displayArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] dataArr = {21,42,11,32,10,3,1};
		System.out.println("Data in Descending order:---");
		int[] dataInDescendingOrder = sortingMaxToMIN(dataArr);
		displayArr(dataInDescendingOrder);
		System.out.println();
		System.out.println("Data in Ascending order:---");
		int[] dataInAscendingOrder = sortingMinToMax(dataArr);
		displayArr(dataInAscendingOrder);
	}
	
}
