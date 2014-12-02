package Objecten;

import java.util.Date;

public class Bestelling {
	private int bestellingId;
	private int klantId;
	private boolean inVerwerking;
	private Date startTijd;
	private Date duur;
	
	public Bestelling(){
		
	}
	
	public int getBestellingId() {
		return bestellingId;
	}
	public void setBestellingId(int bestellingId) {
		this.bestellingId = bestellingId;
	}
	public int getKlantId() {
		return klantId;
	}
	public void setKlantId(int klantId) {
		this.klantId = klantId;
	}
	public boolean isInVerwerking() {
		return inVerwerking;
	}
	public void setInVerwerking(boolean inVerwerking) {
		this.inVerwerking = inVerwerking;
	}
	public Date getStartTijd() {
		return startTijd;
	}
	public void setStartTijd(Date startTijd) {
		this.startTijd = startTijd;
	}
	public Date getDuur() {
		return duur;
	}
	public void setDuur(Date duur) {
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
	private boolean isCompleet;
	private boolean isDadelijk;
	
}
