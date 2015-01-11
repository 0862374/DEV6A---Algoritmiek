package Winkels;

import java.util.ArrayList;
import java.util.List;

import Objecten.Bestelling;
import Objecten.Drukker;
import Objecten.Klant;

public class Drukkerij {
	Drukker drukkerEen = new Drukker();
	Drukker drukkerTwee = new Drukker();
	List<Klant> klanten = new ArrayList<Klant>();
	
	public Drukkerij(){
		
	}
	
	public void nieuweBestelling(Bestelling bestelling){
		
			drukkerEen.nieuweBestelling(bestelling);
		
		//TODO checken of de klant al bestaat
		//klanten.add(bestelling.getKlant());
	}
	
	
	
	public void updateBestelling(){
		drukkerEen.updateBestelling();
	}
	
		
}
