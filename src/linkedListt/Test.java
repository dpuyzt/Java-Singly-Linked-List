package linkedListt;

public class Test {

	public static void main(String[] args) {

		LinkedListt linkedList = new LinkedListt();
		
		linkedList.add(5);
		linkedList.add(15);
		linkedList.add(10);
		
		linkedList.print();
		
		System.out.println("*************");
		
		linkedList.addFirst(4);
		linkedList.print();
		
		System.out.println("*************");
		
		System.out.println(linkedList.getItem(2)); 
		
		
		
	}

}
