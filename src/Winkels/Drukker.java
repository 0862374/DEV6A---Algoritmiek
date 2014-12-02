package Winkels;

import java.util.Date;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import Objecten.Bestelling;

public class Drukker {
	Queue<Bestelling> bestellingen = new LinkedList<Bestelling>();
	Queue<Bestelling> bestellingInVerwerking = new LinkedList<Bestelling>();
	
	public Drukker(){
		
	}
	
	public void nieuweBestelling(Bestelling bestelling){
		bestellingen.add(bestelling);
	}
	
	public void verwijderBestelling(){
		try {
			bestellingen.remove();
		}catch(NoSuchElementException e){
			System.out.println("Er zijn geen bestellingen meer bij de drukkerij");
		}
	}
	
	public void updateBestelling(Bestelling bestelling){
		bestelling.setCompleet(new Date().getTime() > (bestelling.getStartTijd().getTime() + bestelling.getDuur().getTime()));
		bestelling.setInVerwerking(bestellingInVerwerking.isEmpty() && bestelling.getBestellingId() == bestellingen.peek().getBestellingId());
		
	}
	
	
}
