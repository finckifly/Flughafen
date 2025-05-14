public class FlugGast extends Person implements Comparable<FlugGast>{
	
	//Attribute
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FlugKlasse klasse;
	
	//KOnstruktoren
	
	public FlugGast() {
		
	}
	public FlugGast(String vorname, String nachname, FlugKlasse klasse) {
		super(vorname, nachname);
		this.klasse = klasse;
	}

	//Setter und Getter
	public FlugKlasse getKlasse() {
		return klasse;
	}
	public void setKlasse(FlugKlasse klasse) {
		this.klasse = klasse;
	}

	@Override
	public String toString() {
		return "FlugGast [klasse=" + klasse + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", toString()=" + super.toString()+ "]";
	}
	@Override
	public int compareTo(FlugGast o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}