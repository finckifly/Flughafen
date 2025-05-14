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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o); 
    }
}
