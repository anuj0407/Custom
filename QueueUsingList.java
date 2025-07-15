package queue;

class Node {//Node class to implement queue using Linked List
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingList {
	private Node front;//point to first element
    private Node rear;//point to latest element which is added

    public QueueUsingList() {
        this.front = null;
        this.rear = null;
    }

    //function to add in queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // Queue is empty
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    //function to delete from queue
    public void dequeue() {
        if (front == null) { // Queue is empty
            System.out.println("Queue is empty, cannot dequeue.");
        }
        front = front.next;
        if (front == null) { // Queue became empty after dequeue
            rear = null;
        }
    }

    //function to display first element of list
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty, no element to peek.");
        }
        else {
        	System.out.println(front.data);
        }
    }

    //function to check queue is empty or not
    public boolean isEmpty() {
        return front == null;
    }
    
    //function to display all elements in queue
    public void displayAll() {
    	Node temp = front;
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}

    public static void main(String[] args) {
        QueueUsingList myQueue = new QueueUsingList();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(40);
        myQueue.enqueue(30);
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        myQueue.dequeue();
        myQueue.displayAll();
        
    }
}
