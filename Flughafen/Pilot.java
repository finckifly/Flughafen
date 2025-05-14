
public class Pilot extends Person {
	
	// Attribute
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean Kapitaen;
	
	//Konstruktoren
	public Pilot() {
		
	}
	public Pilot(String vorname, String nachname) {
		super(vorname, nachname);
	}

	//Getter und Setter
	public boolean isKapitaen() {
		return Kapitaen;
	}

	public void setKapitaen(boolean kapitaen) {
		Kapitaen = kapitaen;
	}
	@Override
	public String toString() {
		return "Pilot [Kapitaen=" + Kapitaen + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", toString()=" + super.toString() +  "]";
	}
	
}