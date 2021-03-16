package model;

import enums.IdenType;
import enums.Nationality;

public class VipPassenger extends Passenger {
	private int vipNr;
	private String loungeCardNr;
	private static int idCounter = 0;
	
	public int getVipNr() {
		return vipNr;
	}
	
	public void setVipNr() {
		this.vipNr = idCounter++;
	}
	
	public String getLoungeCardNr() {
		return loungeCardNr;
	}
	
	public void setLoungeCardNr(String loungeCardNr) {
		this.loungeCardNr = loungeCardNr;
	}

	public VipPassenger() {
		super();
		this.vipNr = idCounter++;
		this.loungeCardNr = "";
	}
	
	public VipPassenger(String name, String surname, String idenNr, IdenType idType, Nationality nation, boolean isAdult, String extraNeeds, String loungeCardNr) {
		super(name, surname, idenNr, idType, nation, isAdult, extraNeeds);
		this.vipNr = idCounter++;
		this.loungeCardNr = loungeCardNr;
	}

	@Override
	public String toString() {
		return "[" + getName() + " " + getSurname() + ", " + getIdenNr() + ", " + getIdType() + ", " + getNation() + ", " + vipNr + ", " + loungeCardNr + ", " + isAdult()
				+ ", " + getExtraNeeds() + ", " + getIdenNr() + ", " + ", " + getNation() + "]";
	}
}
