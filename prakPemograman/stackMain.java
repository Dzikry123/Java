package prakPemograman;

public class stackMain {
	public static void main(String[] args) { 
		strukturStack stack = new strukturStack(6);
		System.out.println("Latihan 4");
		
		System.out.println("### Sebelum push 3x ###");
		System.out.println("size: " + stack.size() );
		System.out.println("IsEmpty :" + stack.isEmpty() );
		/*
		 * 
		 * 
		 */
		stack.pop(2);
		stack.pop(7);
		stack.pop(6);
		stack.pop(1);
		
		System.out.println("### melakukan push 3x ###");
		System.out.println("size :" + stack.size());
		System.out.println("IsEmpty :" + stack.isEmpty() );
		System.out.println("TOP :" + stack.TOP() );
		System.out.println("Elemen From TOP :" );
		stack.displayElementStack();
//		
		System.out.println("*************************");
		
		// POP
		
		System.out.println("### Sebelum push 3x ###");
		System.out.println("size: " + stack.size() );
		System.out.println("IsEmpty :" + stack.isEmpty() );
		/*
		 * 
		 * 
		 */
		stack.push(2);
		stack.push(7);
		stack.push(6);
		stack.push(1);
		System.out.println("### melakukan push 3x ###");
		System.out.println("size :" + stack.size());
		System.out.println("IsEmpty :" + stack.isEmpty() );
		System.out.println("TOP :" + stack.TOP() );
		System.out.println("Elemen From TOP :" );
		stack.displayElementStack();
		
		System.out.println("*************************");
	}
}