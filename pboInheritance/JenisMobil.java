package pboInheritance;

public class JenisMobil extends Mobil {
	private String sport;

	public JenisMobil(String brand, String platNomor, String sport ) {
		super(brand, platNomor);
		setWarna(sport);
	}
	
	public String getWarna() {
		return sport;
	}
	
	public void setWarna(String sport) {
		this.sport = sport;
	}
	

}
