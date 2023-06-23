package prakPemograman;

public class StrukturQueue {
	private Node FRONT;
	private Node REAR;
	
	public boolean isEmpty() {
		return FRONT == null || REAR == null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		}
		else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}
	
	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while(curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	
	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}
	
	public void displayElementQueues() {
		if (FRONT == null) {
			System.out.println("");
			return ;
		}
		Node curNode = FRONT;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
	}
	
}
