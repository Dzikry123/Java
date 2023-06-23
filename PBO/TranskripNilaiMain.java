package PBO;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		
		// Create Objek Matakuliah
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemograman Berorientasi Objek", "B", 3);
		
		
		// Create Objek khs
		KartuHasilStudi khs = new KartuHasilStudi("2022");
		khs.addMatakuliah(mk1);
		khs.addMatakuliah(mk2);
		khs.addMatakuliah(mk3);
		
		// Create Objek Mahasiswa
		Mahasiswa mhs = new Mahasiswa("303040001", "John");
		
		// Create Objek TranskripNilai
		TranskripNilai transkrip = new TranskripNilai(mhs);
		transkrip.addKHS(khs);
		transkrip.display();
		
	}
}
