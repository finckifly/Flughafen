public class FlugBegleiter extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlugBegleiter() {

	}

	public FlugBegleiter(String vorname, String nachname) {
		super(vorname, nachname);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this == o)
			return true;
		if (this.getClass() != o.getClass())
			return false;

		FlugBegleiter other = (FlugBegleiter) o;
		return other.getNachname() == this.getNachname() && other.getVorname() == this.getVorname();
	}
}
