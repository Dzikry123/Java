package prakPemograman;

public class Main {
	public static void main(String[] args) {
		StrukturList list  = new StrukturList();
		list.addTail(7);
		list.addTail(6);
		list.addTail(4);
		list.addTail(2);
		list.addTail(3);
		list.displayElement();
		list.removeAll();
		list.displayElement();
		
		// Find & Length
		/*System.out.println( "jumlahnya adalah " + list.size());
		System.out.println(list.find(6));
		*/
		
		
	}
}


