package model;

public class Passenger extends Person {
	private boolean isAdult;
	private String extraNeeds;
	
	public boolean isAdult() {
		return isAdult;
	}
	
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	
	public String getExtraNeeds() {
		return extraNeeds;
	}
	
	public void setExtraNeeds(String extraNeeds) {
		this.extraNeeds = extraNeeds;
	}	
	
	public Passenger() {
		super();
		this.isAdult = false;
		this.extraNeeds = "";
	}
	
	public Passenger(String name, String surname, String idenNr, IdenType idType, Nationality nation, boolean isAdult, String extraNeeds) {
		super(name, surname, idenNr, idType, nation);
		this.isAdult = isAdult;
		this.extraNeeds = extraNeeds;
	}

	@Override
	public String toString() {
		return "[" + getName() + " " + getSurname() + ", " + getIdenNr() + ", " + getIdType() + ", " + getNation() + "]";
	}
}
