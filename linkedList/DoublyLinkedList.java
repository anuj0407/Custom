package linkedList;

class Nodes {
	int data;
	Nodes next;
	Nodes prev;
	static int size;
	Nodes(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList {
	Nodes head=null;
	Nodes tail=null;
	static int size =0;
	
	public void addForward(int data) {
		Nodes newNode = new Nodes(data);
		if(head==null ) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		size++;
	}
	public void addBackward(int data) {
		Nodes newNode = new Nodes(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		size++;
	}
	public void addKthPositionFront(int data,int k) {
		 if (k < 1 || k > size + 1) {
		        System.out.println("Invalid position!");
		        return;
		    }
		if(k==1) {
			addForward(data);
		}
		else if(k==size+1) {
			addBackward(data);
		}
		else {
			Nodes newNode = new Nodes(data);
			
			Nodes temp=head;
			for(int i=1;i<k-1;i++) {
				temp=temp.next;
				
			}
			newNode.next=temp.next;
			temp.next=newNode;
			newNode.prev=temp;
		}
		size++;
	}
	
	public void deleteForward() {
		if(head==null ) {
			System.out.print("The list is already empty");
			return ;
		}
		head=head.next;
		head.prev=null;
		size--;
	}
	public void deleteBackward() {
		if(head ==null) {
			System.out.print("The list is already empty");
			return ;
		}
		tail=tail.prev;
		tail.next=null;
		size--;
	}
	public void deleteKthPosition(int k) {
		if(k==1) {
			deleteForward();
		}
		else if(k==size) {
			deleteBackward();
		}
		else {
			Nodes curr =head;
			for(int i=1;i<k-1;i++) {
				curr=curr.next;
				
			}
			curr.next=curr.next.next;
		}
	}
	
	public void displayBackword(){
		Nodes curr=tail;
		if(tail==null) {
			System.out.println("List is empty");
			return ;
		}
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.prev;
			
		}
		System.out.println();
	}
	public void displayForward(){
		Nodes curr=head;
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList ll =new DoublyLinkedList();
		ll.addForward(10);
		ll.addForward(20);
		ll.addForward(30);
		ll.addBackward(100);
		ll.addBackward(200);
		ll.addBackward(300);
		ll.addKthPositionFront(45,3);
		ll.deleteKthPosition(3);
		//ll.deleteForward();
		//ll.deleteBackward();
		ll.displayForward();
		System.out.println(size);
		ll.displayBackword();
		
		

	}

}