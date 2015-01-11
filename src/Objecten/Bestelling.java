package Objecten;

import java.util.Date;

public class Bestelling {
	private int bestellingId;
	private Klant klant;
	private Date startTijd;
	private long duur;
	private boolean inVerwerking;
	private boolean isCompleet;
	private boolean isDadelijk;
	
	public Bestelling(int bestellingId, Klant klant){
		this.bestellingId = bestellingId;
		this.klant = klant;
	}
	
	public int getBestellingId() {
		return bestellingId;
	}
	public void setBestellingId(int bestellingId) {
		this.bestellingId = bestellingId;
	}
	public Klant getKlant() {
		return klant;
	}
	public void setKlantId(Klant klant) {
		this.klant = klant;
	}
	public boolean isInVerwerking() {
		return inVerwerking;
	}
	public void setInVerwerking(boolean inVerwerking) {
		this.inVerwerking = inVerwerking;
		if(inVerwerking){
			setDadelijk(!inVerwerking);
			setStartTijd(new Date());
		}
	}
	public Date getStartTijd() {
		return startTijd;
	}
	public void setStartTijd(Date startTijd) {
		this.startTijd = startTijd;
	}
	public long getDuur() {
		return duur;
	}
	public void setDuur(long duur) {
		this.duur = duur;
	}
	public boolean isCompleet() {
		return isCompleet;
	}
	public void setCompleet(boolean isCompleet) {
		this.isCompleet = isCompleet;
	}
	public boolean isDadelijk() {
		return isDadelijk;
	}
	public void setDadelijk(boolean isDadelijk) {
		this.isDadelijk = isDadelijk;
	}
	
	
}
