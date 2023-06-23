package PBO;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class TranskripNilai {
	private Date tglCetak;
	private double ipk = 0.0;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;
	
	public TranskripNilai(Mahasiswa mahasiswa) {
		super();
		this.mahasiswa = mahasiswa;
		
		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}

	public double ipk() {
		return 0;
	}
	
	public void addKHS (KartuHasilStudi khs) {
		kartuHasilStudi.add(khs);
	}
	
	public void display() {
		System.out.println(mahasiswa.display());
		System.out.println("Tanggal cetak: " + tglCetak.toString());
		System.out.println("IPK : " + ipk() );
		for (KartuHasilStudi khs : kartuHasilStudi) {
			System.out.println(khs.display());
		}
	}
}




 