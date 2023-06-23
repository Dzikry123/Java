package PBO2;

import PBO2.Bentuk;

public abstract class Bentuk {
	protected double PHI = 3.14;
	protected int jari2;
	
	public Bentuk (int jari) {
		super();
		this.jari2 = jari2;
		
	}
	
	public abstract double luas();
	
	//setter & getter
	
	public int getJari2() {
		return jari2;
	}
	
	public void setJari2(int jari2) {
		this.jari2 = jari2;
	}
}


