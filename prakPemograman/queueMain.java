package prakPemograman;

public class queueMain {
	public static void main(String[] args) {
		StrukturQueue queue = new StrukturQueue();
		// Latihan 4
		System.out.println("Latihan 4");
		
		System.out.println("### Sebelum Enqueue 3x ###");
		System.out.println("size: " + queue.size() );
		System.out.println("IsEmpty :" + queue.isEmpty() );
		/*
		 * 
		 * 
		 */
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(1);
		System.out.println("### Enqueue 3x ###");
		System.out.println("size :" + queue.size());
		System.out.println("IsEmpty :" + queue.isEmpty() );
		System.out.println("Front :" + queue.front() );
		
		System.out.println("*************************");
		
		//Latihan 5
		/*
		 * WARNING!!!!!
		 * Comment Latihan 4 before run Latihan 5 
		 */
		 
		System.out.println("Latihan 5");
		System.out.println("### Sebelum Enqueue 4x ###");
		System.out.println("size: " + queue.size() );
		System.out.println("IsEmpty :" + queue.isEmpty() );
		/*
		 * 
		 * 
		 */
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(1);
		System.out.println("### Enqueue 3x ###");
		System.out.println("size :" + queue.size());
		System.out.println("IsEmpty :" + queue.isEmpty() );
		queue.displayElementQueues();
		System.out.println("\n");
		System.out.println("Front :" + queue.front() );
	}
}
