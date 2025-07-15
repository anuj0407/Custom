package searching;

public class CustomSearchByTwoMid {
	public static boolean customSearch(int left, int right,int[] array,int data) {
	      if(right>=left) {
	           int mid1 = left+(right-left)/3;
	           int mid2 = right-(right-left)/3;
	           if(array[mid1]==data) {
	               return true;
	           }
	           if(array[mid2]==data) {
	               return true;
	           }
	           else if(data>array[mid2]) {
	               return customSearch(right, mid2-1, array, data );
	           }
	           else if(data<array[mid1]) {
	               return customSearch(left, mid1+1, array, data);
	               
	           }
	           else {
	               return customSearch(mid1+1, mid2-1, array, data);
	           }
	       }
	       return false;	
	}
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9};
	   boolean exist = customSearch(0, array.length-1, array, 4);
	   if(exist) {
	       System.out.println(" Find the data ");
	   }
	   else {
	       System.out.println(" Data not found");
	   }
	}
}
