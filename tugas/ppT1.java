package tugas;

public class ppT1 {
	private ListNode head;
	
	private static class ListNode {
		private int data; // Generic Type
		private ListNode next;
		
		public ListNode ( int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// add Node at the Beginning
	public void insertFirst (int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	// add Node last
	public void insertLast (int value) {
		ListNode newNode = new ListNode(value);
		if ( head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	// add Node in Flexible position
	public void insertFlexible( int position, int value) {
		ListNode node = new ListNode(value);
		
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1; // position - 1
			
			while( count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	
	
	
	public static void main(String[] args) {
		ppT1 sl = new ppT1();
		
		//insert last
		sl.insertLast(3);
		sl.insertLast(4);
		
		//insert flexible
		sl.insertFlexible(2,7);
		sl.insertFlexible(2,8);
		
		//insert first
		sl.insertFirst(5);
		
		
		
		sl.display();
		
	}
}
