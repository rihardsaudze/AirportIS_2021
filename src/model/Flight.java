package model;

import java.util.Date;
import java.util.PriorityQueue;

public class Flight {
	private int flightNr;
	private Date dateAndTime;
	private byte duration;
	private PriorityQueue<BoardingPass> allPassengers;
	private Airport airportFrom;
	private Airport airportTo;
	
	public int getFlightNr() {
		return flightNr;
	}
	
	public void setFlightNr(int flightNr) {
		this.flightNr = flightNr;
	}
	
	public Date getDateAndTime() {
		return dateAndTime;
	}
	
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	public byte getDuration() {
		return duration;
	}
	
	public void setDuration(byte duration) {
		this.duration = duration;
	}
	
	public PriorityQueue<BoardingPass> getAllPassengers() {
		return allPassengers;
	}
	
	public void setAllPassengers(PriorityQueue<BoardingPass> allPassengers) {
		this.allPassengers = allPassengers;
	}

	public Airport getAirportFrom() {
		return airportFrom;
	}

	public void setAirportFrom(Airport airportFrom) {
		this.airportFrom = airportFrom;
	}

	public Airport getAirportTo() {
		return airportTo;
	}

	public void setAirportTo(Airport airportTo) {
		this.airportTo = airportTo;
	}
	

	public Flight() {
		setAirportFrom(new Airport());
		setAirportTo(new Airport());
		setDateAndTime(new Date());
		setDuration((byte)0);
	}

	public Flight(Airport airportFrom, Airport airportTo, Date dateAndTime, byte duration) {
		this.airportFrom = airportFrom;
		this.airportTo = airportTo;
		this.dateAndTime = dateAndTime;
		this.duration = duration;
	}
}
