package prakPemograman;

import java.util.Stack;//import library stack
public class Tubes {
    private int maxSize;        // maximum size of the stack
    private int[] stackArray;   // array to store stack elements
    private int top;            // top of the stack

    // Constructor untuk menginisiasi stack
    public Tubes(int size) {
        maxSize = size;
        stackArray = new int[maxSize]; // data array akan diambil dari maxSize
        top = -1;  // initiasi jika stack kosong (empty)
        
        /*Dalam tumpukan, elemen ditambahkan dan dihapus dari atas. 
        Variabel teratas mewakili indeks elemen teratas saat ini di tumpukan. 
        Dengan mengurangi 1 dari atas, kita mendapatkan indeks elemen yang ada dibawahnya.
        
        misal maxSize 3, maka top = 2, sehingga jika hendak melakukan push sudah tidak bisa
        karena diatas TOP sudah ada elemen ke-3 
        */
    }

    // Method untuk push sebuah element kedalam stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Tidak bisa melakukan push element.");
        } else {
            stackArray[++top] = value; // top -> ( -1 + 1 ) dst.... ** array dimulai dari index 0
            							// kalo ditulis jadi top++ akan error
            System.out.println("Pushed " + value + " Piring kotor ke dalam stack.");
        }
    }

    // Method untuk pop sebuah element dari stack
    public int pop() {
        if (top == -1) { // ini menjadi -1 dibawah elemen Stack
            System.out.println("\nStack is empty. Tidak bisa melakukan pop element.");	// " \n = enter "
            return 0;  
        } else {
            int value = stackArray[top--]; //jika [--top] akan menghapus dari tengah, error
            System.out.println("Popped " + value + " Piring bersih dari stack.");
            return value;
        }
    }
    
    // Method untuk check apakah stack kosong(empty)
	public boolean isEmpty() {
		return stackArray == null;
	}
	
    // Method untuk check jika stack dalam keadaan full
    public boolean isFull() {
        return (top == maxSize - 1);
        // maxSize = 5 -1  -> top = 4
        // ketika ada stack baru yang ingin ditambahkan, maka akan terjadi error karena stack yang ke-5 sudah ada isi nya
    }

    // Method to get the top element of the stack
    public int topElement() {
        if (top == -1) {
            System.out.println("\nStack is empty, No top element.");
            return 0; //membuat Top Element : 0  
            // atau akan ada pengecualian
        } else {
            return stackArray[top];// karena tidak ada pengurangan seperti pada push & pop
            						//maka akan diambil element paling atas
        }
    }

    // Method untuk mendapatkan size (ukuran) sebuah stack
    public int size() {
        return top + 1; // kenapa + 1 ? karena array dimulai dari 0
        				// misal top 5 ->  [0,1,2,3,4] agar mudah hasil mudah dibaca jadi top + 1
    }

    // Main program untuk mengeksekusi struktur yang telah dibuat diatas
    public static void main(String[] args) {
    	System.out.println("TUBES STACK \nKelompok-2 \nKasus : Stack Piring Kotor & Piring Bersih \n");
        Tubes stack = new Tubes(3); // inisiasi

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(1);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.topElement());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull:  " + stack.isFull() + " \n");
        
        // " \n = enter"
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.topElement());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull:  " + stack.isFull() + " \n");
    }
}