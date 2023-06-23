package PBO;

public class Mahasiswa {
	private String NRP;
	private String nama;
	
	public Mahasiswa( String nRP, String nama) {
		super();
		NRP = nRP;
		this.nama = nama;
	}
	
	public String display() {
		return "NRP: " + NRP + ", Nama : " + nama ;
	}
}
