package PBO;

import java.util.Scanner;

public class MatakuliahMain {
	// create objek matakuliah
	public static void main(String[] args) {
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("001", "Algoritma Pemograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("001", "Pemograman Berorientasi Objek", "B", 3);
	
		//Tampilkan daftar matakuliah
		System.out.println("---- Daftar Matakuliah ----");
		System.out.println(mk1.display());
		System.out.println(mk3.display());
		System.out.println(mk2.display());
		
		System.out.println(" ----- Nilai IPK -----");

		
		
		// COunt IPK ?
		// Rumus : ( index nilai * sks) + (index nilai * sks) ... (index nilai * sks/total_skss
		
		Matakuliah ipk = new Matakuliah(null, null, null, 0);
		ipk.nilaiIndex();
		System.out.println(ipk.nilaiIndex());
	}
}
