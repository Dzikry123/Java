//package PBO2;
//
//public class Tabung extends Bentuk {
//	private int tinggi;
//	
//	public Tabung() {
//		super(0);
//	}
//	
//	public Tabung(int jari2, int tinggi) {
//		super(jari2);
//		this.tinggi = tinggi;
//	}
//	
//	@Override
//	public double luas() {
//		return 2*PHI*jari2*(jari2+tinggi);
//	}
//	
//	//setter & getter
//	
//	public int getTinggi() {
//		return tinggi;
//	}
//	
//	public void setTinggi(int tinggi) {
//		this.tinggi = tinggi;
//	}
//	
//	
//}
//
//
//public interface Kartu{
//	public boolean otentikasi(String pin);
//	public String encode(String pin);
//}
//
//public class Kartuelektronik implements Kartu {
//	public KartuElektronik(String kodeBank, String pin) {
//		super();
//		this.kodeBank = kodeBank;
//		this.pin = pin;
//	}
//}
//
//@Override
//public boolean otentikasi(String pin) {
//	return null;
//}
//
//
//public class InterfaceMain {
//	public static void main(String[] args) {
//		KartuElektronik kartu = new KartuElektronik("IFill", "123");
//		System.out.println("Otentikasi:"+ kartu.otentikasi("123"));
//	}
//}
//
//
//
//
