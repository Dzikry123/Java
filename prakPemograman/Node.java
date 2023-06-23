package prakPemograman;

public class Node {
	private int data;
	private Node next;
	
	public Node (int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	//getter
	public Node getNext() {
		return next;
	}
	
	//setter
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	//getter
//	public Node getNext() {
//		return next;
//	}
//	
//	//setter
//	public void setNext(Node next) {
//		this.next = next;
//	}
//	
//	public int getData () {
//		return data;
//	}
}

