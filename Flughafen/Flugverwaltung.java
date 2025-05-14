import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flugverwaltung {
	public static String importFlugGaeste(String filename) {
		try (BufferedReader bReader = new BufferedReader(new FileReader(filename))) {
			String gelesen = "";
			String zeile = "";
			while ((zeile = bReader.readLine()) != null) {
				gelesen += zeile + "\n";
			}
			bReader.close();
			return gelesen;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
