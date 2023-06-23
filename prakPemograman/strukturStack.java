package prakPemograman;

public class strukturStack {
	private int[] array;
	private int capacity;
	private int TOP;
	
	public final int MIN = -1;
	
	public strukturStack(int capacity) {
		super();
		array= new int[capacity];
		this.capacity = capacity;
		TOP = MIN;
	}
	
	public boolean isEmpty() {
		return array == null;
	}
	
	private boolean isFull() {
		return true;
	}
	
	//push
	public void push(int data) {
		
		if (isFull()) {
			System.out.println("Stack Penuh");
		}
		else {
			TOP++;
			array[TOP] = data;
		}
	}
	
	//pop
	public void pop(int data) {
		
		if (isFull()) {
			System.out.println("Stack Penuh");
		}
		else {
			TOP++;
			array[TOP] = data;
		}
	}

	
	
	public int size() {
		int size = 0;
		while(array.length != 0) {
			size++;
		}
		return size;
	}
	
	public int TOP() {
		return TOP != 0 ? array[0] : null;
	}
	
	public void displayElementStack() {
		if (capacity == 0) {
			System.out.println("Stack Kosong");
			return ;
		}
		while (array.length != 0) {
			System.out.print(array + " ");
		}
	}
}
