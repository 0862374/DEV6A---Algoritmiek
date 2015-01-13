import Objecten.Bestelling;
import Objecten.Klant;
import Winkels.Drukkerij;
import Objecten.MergeSort;


public class Main {

	public static void main(String[] args) {
		Drukkerij drukkerij = new Drukkerij();
		Klant klant = new Klant(0, "Vos", "van der", "Jan", 19, true, "Rotterdam", "jvdv@o.nl");
		Bestelling bestelling = new Bestelling(0, klant);
		Bestelling bestelling1 = new Bestelling(1, klant);
		
		drukkerij.nieuweBestelling(bestelling);
		drukkerij.nieuweBestelling(bestelling1);
		drukkerij.updateBestelling();
		
	}

}
