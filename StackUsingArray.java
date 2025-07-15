package stack;

class Stack{
	private int top;
	private int[] arr;
	Stack(){
		arr = new int[10];
		this.top = -1;
		for(int i =0; i<10;i++) {
			arr[i]=-1;
		}
	
	}
	Stack(int sizeOfArray){
		arr = new int[sizeOfArray];		
		this.top =-1;
		for(int i =0; i<arr.length;i++) {
			arr[i]=-1;
		}
	} 
	
	public void resize() {
		if(top>=arr.length) {
			int[] newArr = new int[arr.length*2];
			for(int i =0;i<arr.length;i++) {
				newArr[i]=arr[i];
			}
			for(int i =arr.length;i<newArr.length;i++) {
				newArr[i] = -1;
			}
			arr = newArr;
		}
	}
	
	public void push(int val) {
		top++;
		resize();
		arr[top] = val;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		int temp = arr[top];
		arr[top] = -1;
		top--;
		return temp;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println(arr[top]);
		}
	}
	
	public void displayAll() {
		for(int i = top;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}

public class StackUsingArray {
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(2);
		st.push(4);
		st.push(6);
		st.push(1);
		st.push(10);
		st.peek();
		int rmNum = st.pop();
		System.out.println("Removed number : " +rmNum);
		st.peek();
		System.out.println(st.isEmpty());
		st.displayAll();
 	}
	
}
