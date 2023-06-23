//package prakPemograman;
//
//public class Matakuliah {
//	private String kode;
//	private String nama;
//	private int sks;
//	private Node HEAD;
//	
//	public Matakuliah (String kode, String nama, int sks) {
//		super();
//		this.kode = kode;
//		this.nama = nama;
//		this.sks = sks;
//	}
//	
//	public boolean isEmpty() {
//		return HEAD == null;
//	}
//	
//	public class Node {
//		private int data2;
//		private Matakuliah data;
//		private Node next;
//		
//		public Node(Matakuliah data) {
//			this.data = data;
//		}
//		
//		//getter
//		public Node getNext() {
//			return next;
//		}
//		
//		public int getData () {
//			return data2;
//		}
//		
//		public void setNext(Node next) {
//			this.next = next;
//		}
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
//	
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
