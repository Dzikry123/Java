//package prakPemograman;
//
//import prakPemograman.Matakuliah.Node;
//
//public class ListMataKuliah {
//	private Node HEAD;
//	
//	public boolean isEmpty() {
//		return HEAD == null;
//	}
//	
//	public void addHead (Matakuliah data) {
//		Node newNode = new Node(data);
//		if (isEmpty()) {
//			HEAD = newNode;
//		}
//		else {
//			newNode.setNext(HEAD);
//			HEAD = newNode;
//		}
//	}
//	
//	public void displayElement() {
//		if (isEmpty()) {
//			System.out.println("List Kosong");
//		}
//		else {
//			Node curNode = HEAD;
//			while (curNode != null) {
//				System.out.println(curNode.getData().getKode() + getNama() + getSks());
//				curNode = curNode.getNext();
//			}
//			System.out.println();
//		}
//	}
//}
