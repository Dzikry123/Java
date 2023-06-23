package List;

public class StrukturList {
	
	private Node HEAD;
	
	public void addTail ( int data) {
		Node posNode;
		Node curNode;
		
		Node newNode = new Node(data);
		
		if (HEAD == null ) {
			HEAD = newNode;
		} else {
			curNode = HEAD;
			while ( null != curNode) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
		}
	}
	
	
	
	
	
	
	
	
//	Remove
	
	public boolean isEmpty () {
		return false;
	}
	
	public void dispose(Node HEAD) { 
		 HEAD = null;
	}
	
	public void removeHead() {
		if (isEmpty()) {
			System.out.println("List Kosong");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}
}
