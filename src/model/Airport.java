package model;
import enums.AirportName;

public class Airport {
	private AirportName name;
	private String airportNr;
	private int capacity;
	
	public AirportName getName() {
		return name;
	}

	public void setName(AirportName name) {
		this.name = name;
	}
	
	public String getAirportNr() {
		return airportNr;
	}

	public void setAirportNr(String airportNr) {
		this.airportNr = airportNr;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Airport() {
		this.name = AirportName.BARSELONA;
		this.airportNr = "";
		this.capacity = 0;
	}
	
	public Airport(AirportName name, String airportNr, int capacity) {
		this.name = name;
		this.airportNr = airportNr;
		this.capacity = capacity;
	}	
}
