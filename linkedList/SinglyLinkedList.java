package linkedList;

	class Node{
		int data ;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}	
	}


public class SinglyLinkedList {
	
	 Node head;
	 Node tail;
	 static int size;
	SinglyLinkedList(){
		this.head = null;
		this.tail= null;
	}
	
	public void addAtFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public void addAtLast(int data){
		Node newNode = new Node(data);
		if(tail == null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void displayList() {
		while(head.next!=null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print(head.data);
	}
	
	public void getSize() {
		System.out.println("Size of LinkedList : " +size);
	}
	
	public void addAtMid(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		if(head==null) {
			head = tail = newNode;
		}
		else {
				int mid = size / 2;
				while(mid > 1) {
					temp = temp.next;
					mid--;
				}
				Node later = temp.next;
				temp.next = newNode;
				newNode.next = later;
		}
		size++;
	}
	
	public void addAtPosition(int pos , int data) {
		Node newNode = new Node(data);
		if(pos == 1) {
			addAtFirst(data);
		}
		else if(pos == size) {
			addAtLast(data);
		}
		else {
			Node temp = head;
		while(pos-- > 1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}
	
	public void deleteFromEnd() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		size--;
	}
	
	public void deleteFromStart() {
		head = head.next;
		size--;
	}
	
	public void deleteFromPosition(int pos) {
		Node prev = null;
		Node curr = head;
		while(pos-- > 1) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
	}
	
	
	
	
	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addAtFirst(10);
		ll.addAtFirst(20);
		ll.addAtFirst(30);
		ll.addAtLast(40);
		ll.addAtLast(50);
		ll.getSize();
		ll.addAtPosition(3, 60);
		ll.getSize();
		ll.addAtMid(25);
		ll.getSize();
		ll.deleteFromEnd();
		ll.getSize();
		ll.deleteFromStart();
		ll.getSize();
		ll.deleteFromPosition(3);
		ll.displayList();
		
		
		
		
	}
}
