package model;

public class BoardingPass {
	private String boardingPassNr;
	private short group;
	private Passenger passenger;
	
	public String getNr() {
		return boardingPassNr;
	}
	
	public void setNr(String boardingPassNr) {
		this.boardingPassNr = boardingPassNr;
	}
	
	public short getGroup() {
		return group;
	}
	
	public void setGroup(short group) {
		this.group = group;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
}
