package searching;
import java.util.*;

public class SearchUsingHashSet {
	public static boolean searchInSet(int[] arr, int data) {
		HashSet<Integer> set = new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		boolean exist = set.contains(data);
		return exist;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,3,2,4,5};
		boolean exist = searchInSet(arr,24);
		if(exist) {
			System.out.println("Data found");
		}
		else {
			System.out.println("Data not found");
		}
	}
	
}
