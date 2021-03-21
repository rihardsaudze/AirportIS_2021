package model;

import utils.IdNumberGenerator;

public class BoardingPass {
	private String boardingPassNr;
	private short group;
	private Passenger passenger;
	private Seat seat = new Seat();
	
	public String getNr() {
		return boardingPassNr;
	}
	
	public void generateNr() {
		this.boardingPassNr = "" + passenger.getName().charAt(0) + passenger.getSurname().charAt(0) + getSeat() + getGroup();
	}
	
	public short getGroup() {
		return group;
	}
	
	public void generateGroupByPriority() {	//VIP GROUP 1, REST RNG
		if (passenger instanceof VipPassenger) {
			this.group = 1;
		} else {
			this.group = (short)IdNumberGenerator.generateNr("groupNr");
		}
	}
	
	public void generateSeatByPriority() {
		seat.setRow((char)('a' + IdNumberGenerator.generateNr("rowNr")));
		if (passenger instanceof VipPassenger) {
			seat.setSeat((short)IdNumberGenerator.generateNr("seatNrVip"));
		} else {
			seat.setSeat((short)IdNumberGenerator.generateNr("seatNr"));
		}
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public BoardingPass() {
		super();
		generateNr();
		generateGroupByPriority();
		generateSeatByPriority();
		this.passenger = new Passenger();
	}	
	
	public BoardingPass(Passenger passenger) {
		generateNr();
		generateGroupByPriority();
		generateSeatByPriority();
		setPassenger(passenger);
	}

	@Override
	public String toString() {
		return passenger.getName() + " " + passenger.getSurname() + ", " + boardingPassNr + ", " + seat;
	}
	
}
