import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {

	// Attribute

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String vorname;
	private String nachname;

	// Konstruktoren
	public Person() {

	}

	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	// Setter und Getter

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + "]";
	}
	 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) &&
               Objects.equals(nachname, person.nachname);
    }
}
