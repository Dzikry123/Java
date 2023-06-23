package pboInheritance;

public class Mobil {
	protected String brand;
	protected String platNomor;
	
	public Mobil(String brand, String platNomor) {
		this.brand = brand; 
		this.platNomor = platNomor;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getPlatNomor() {
		return platNomor;
	}
}

