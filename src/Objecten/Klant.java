package Objecten;

import java.util.ArrayList;

public class Klant {
	private int klantId;
	private String achternaam;
	private String tussenvoegsel;
	private String voornaam;
	private int leeftijd;
	private boolean IsMan;
	private String plaats;
	private String emailadres;
	
	
	
  
	public Klant(int klantId, String achternaam, String tussenvoegsel, String voornaam, int leeftijd, boolean IsMan, String plaats, String emailadres){
		this.klantId = klantId;
		this.achternaam = achternaam;
		this.tussenvoegsel = tussenvoegsel;
		this.voornaam = voornaam;
		this.leeftijd = leeftijd;
		this.IsMan = IsMan;
		this.plaats = plaats;
		this.emailadres = emailadres;
	}
	
	public int getKlantId() {
		return klantId;
		
	}
	public void setKlantId(int klantId) {
		this.klantId = klantId;
		
	}
	public String getAchternaam() {
		return achternaam;
	}
	
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
		
	}
	
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	
	public String getVoornaam() {
		return voornaam;
	}
	
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
	public int getLeeftijd() {
		return leeftijd;
	}
	
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	
	public boolean isIsMan() {
		return IsMan;
	}

	public void setIsMan(boolean isMan) {
		IsMan = isMan;
	}
	
	public String getPlaats() {
		return plaats;
	}
	
	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}
	
	public String getEmailadres() {
		return emailadres;
	}
	
	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
