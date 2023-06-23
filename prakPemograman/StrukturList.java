package prakPemograman;

public class StrukturList {
	private Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	// Head
	public void addHead (int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	// Mid
	public void addMid (int data, int position) {
		
		// posNode = Position Node
		Node posNode = null, curNode, newNode =  new Node(data);
		int i;
		
		// Check seluruh node didalam list yang sudah ada
		if ( isEmpty() ) {
			head = newNode;
		} else {
			curNode = head;
			
			// check node baru
			if (position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			} else {
				i = 1;
				while (curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
				posNode.setNext(newNode);
                newNode.setNext(curNode);
			}
		}
	}
	
	// Mid Optional
	/*
	 * 	public void addMid (int data, int position) {
		Node mid = new Node (data);
		
		if ( position == 1) {
			mid.setNext(head);
			head = mid;
		} else {
			Node previous = head;
			int i = 1;
			while ( i < position - 1) {
				previous = previous.getNext();
				i++;
			}
			Node current = previous.getNext();
			mid.setNext(current);
			previous.setNext(mid);
		}
	}
	 * 
	 */
	
	
	// Tail
	public void addTail (int data) {
		Node curNode, posNode = null;	
		Node newNode = new Node(data);
		
		if (isEmpty() ) {
			head = newNode;
		} else {
			curNode = head;
			while ( curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	// Dispose
	public void dispose( Node data) {
		data = null;
	}
	
	
	// Remove Head
	public void removeHead() {
		Node temp;
		
		if ( head != null) {
			temp = head;
			head = head.getNext();
			dispose(temp);
		}
	}
	
	// Remove Mid
	public void removeMid( int data, int position) {
		
		// preNode = Previous Node
		Node preNode = null, curNode;
		int i;
		
		if ( isEmpty() ) {
			System.out.println("Struktur List tidak ada");
		} else {
			curNode = head;
			i = 1;
			
			while( curNode != null && curNode.getData() != data && curNode.getNext() != null && i < position) {
				preNode = curNode;
				curNode = curNode.getNext();
				i++;
			}
			preNode.setNext(curNode.getNext());
			dispose(curNode);
		}
		
	}
	
	// Remove Tail
	public void removeTail() {
		Node preNode = null, lastNode;
		
		if ( head != null ) {
			if ( head.getNext() ==  null) {
				head = null;
			} else {
				lastNode = head;
				while (lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();
				}
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
	}
	
	
	// Find
	public boolean find( int x) {
		Node curNode = head;
		boolean ketemu = false;
		
		while ( curNode != null && !ketemu) { 
			if (curNode.getData() == x)
				ketemu = true;
			 else 
				curNode = curNode.getNext();
			
		}
		
		return ketemu;
	}
	
	// Size
	public int size() {
		Node curNode = head;
		int jumlah = 0;
		
		while ( curNode != null ) {
			jumlah = jumlah + 1;
			// atau jumlah++
			curNode = curNode.getNext();
		}
		
		return jumlah;
		
		
	}
	// Remove All List
	public Node removeAll() {
		Node temp = head;
		
		while (temp != null) {
			temp = temp.getNext();
			dispose(head);
			head = temp;
		}
		System.out.println("List Kosong");
		
		return head;
	}
	
	// display
	public void displayElement() {
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.getData() + " -> ");
			curNode = curNode.getNext();
		}
		System.out.println("null");
	}
}
