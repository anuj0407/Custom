package queue;

class Queue{
	private int top;
	private int rear;
	private int[] arr;
	Queue(){
		arr = new int[10];
		this.top = 0;
		this.rear = -1;
		for(int i =0;i<10;i++) {
			arr[i] = -1;
		}
	}
	
	public void resize() {
		if(rear>=arr.length) {
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
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void enQueue(int data) {
		rear++;
		resize();
		arr[rear]=data;
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			arr[top] = -1;
			top++;
		}
//		int temp = arr[top];
		
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println(arr[top]);
		}
	}
	
	public void displayAll() {
		for(int i = top;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}


public class QueueUsingArray {

	public static void main(String[] args) {
		Queue que = new Queue();
		que.enQueue(20);
		que.enQueue(28);
		que.enQueue(12);
		que.enQueue(3);
		que.displayAll();
		que.deQueue();
		que.displayAll();
		boolean check = que.isEmpty();
		System.out.println("Is Queue Empty ? :" +check);
		que.peek();
	}
	
}
