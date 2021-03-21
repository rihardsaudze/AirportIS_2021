package model;

import enums.AirportName;
import utils.IdNumberGenerator;

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

	private void setAirportNr() {
		if (this.name == AirportName.BARSELONA) {
			this.airportNr = "BAR" + IdNumberGenerator.generateNr("airportNr");
		} else if (name == AirportName.OSLO) {
			this.airportNr = "OSL" + IdNumberGenerator.generateNr("airportNr");
		} else if (name == AirportName.RIGA) {
			this.airportNr = "RIG" + IdNumberGenerator.generateNr("airportNr");
		} else if (name == AirportName.TALLINN) {
			this.airportNr = "TAL" + IdNumberGenerator.generateNr("airportNr");
		} else {
			this.airportNr = "";
		}
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Airport() {
		this.name = AirportName.BARSELONA;
		setAirportNr();
		this.capacity = 0;
	}
	
	public Airport(AirportName name, int capacity) {
		this.name = name;
		setAirportNr();
		this.capacity = capacity;
	}	
}
