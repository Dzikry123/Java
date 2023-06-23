package pboInheritance;

public class inheritanceMain {
	public static void main(String[] args) {
		JenisMobil mhs = new JenisMobil("BMW ", " D 123 123 ", " Sport");
		System.out.println( mhs.getBrand() + "-" +
		mhs.getPlatNomor() + "-" 
		+ mhs.getWarna());
	}
}
