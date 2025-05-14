public class FlugGast extends Person implements Comparable<FlugGast> {

	// Attribute

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FlugKlasse klasse;

	// KOnstruktoren

	public FlugGast() {

	}

	public FlugGast(String vorname, String nachname, FlugKlasse klasse) {
		super(vorname, nachname);
		this.klasse = klasse;
	}

	// Setter und Getter
	public FlugKlasse getKlasse() {
		return klasse;
	}

	public void setKlasse(FlugKlasse klasse) {
		this.klasse = klasse;
	}

	@Override
	public String toString() {
		return "FlugGast [klasse=" + klasse + ", getVorname()=" + getVorname() +
				", getNachname()=" + getNachname() + "]";
	}

	@Override
	public int compareTo(FlugGast o) {
		return this.getNachname().compareTo(o.getNachname());
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this == o)
			return true;
		if (this.getClass() != o.getClass())
			return false;

		FlugGast other = (FlugGast) o;
		return other.getNachname() == this.getNachname() && other.getVorname() == this.getVorname()
				&& this.getKlasse() == other.getKlasse();
	}
}