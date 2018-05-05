package linkedListt;

public class LinkedListt {
	
	private Node head;
	private int count;
	
	public LinkedListt() {
		head=null;
		count=0;
	}
	
	public void add(int data) {
		
		if(head==null) {
			this.head = new Node(data);
			count++;
			return;
		}
		
		Node tmp = new Node(data);
		Node currentNode=head;
		
		while(currentNode.getNextNode() != null) {
			currentNode=currentNode.getNextNode();
		}
		
		currentNode.setNextNode(tmp);
		count++;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public int getItem(int indeks) {
		
		if(indeks<=0)
			return -1;
		if(head==null)
			return -1;
		
		Node currentNode=head;
		
		for(int i=1;i<indeks;i++) {
			currentNode=currentNode.getNextNode();
		}
		
		return currentNode.getData();
	}
	
	public void addFirst(int data) {
		
		Node tmp=new Node(data);
		tmp.setNextNode(head);
		head=tmp;
		count++;
	}
	
	public void removeEnd(){
		
		Node current=head;
		
		while(current.getNextNode().getNextNode() !=null) {
			current=current.getNextNode();
		}
		
		current.setNextNode(null);
		count--;
	}
	
	
	public void removeFirst() {
		Node second=head.getNextNode();
		head=second;
		count--;
	}
	
	public void delete(int indeks) {
		Node current=head;
		
		for(int i=1;i<indeks;i++) {
			current=current.getNextNode();
		}
		
		current.setNextNode(current.getNextNode().getNextNode());
		count--;
	}
	
	public void print() {
		
		System.out.print("[");
		
		for(int i=1;i<=getSize();i++) {
			System.out.print(getItem(i));
			if(i<getSize())
				System.out.print(",");
		}
		System.out.println("]");
	}
	  

}
