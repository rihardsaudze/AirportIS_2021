package model;

public class VipPassenger extends Passenger {
	private int vipNr;
	private String loungeCardNr;
	
	public int getVipNr() {
		return vipNr;
	}
	
	public void setVipNr(int vipNr) {
		this.vipNr = vipNr;
	}
	
	public String getLoungeCardNr() {
		return loungeCardNr;
	}
	
	public void setLoungeCardNr(String loungeCardNr) {
		this.loungeCardNr = loungeCardNr;
	}

	public VipPassenger() {
		super();
		this.vipNr = 0;
		this.loungeCardNr = "";
	}
	
	public VipPassenger(String name, String surname, String idenNr, IdenType idType, Nationality nation, boolean isAdult, String extraNeeds, int vipNr, String loungeCardNr) {
		super(name, surname, idenNr, idType, nation, isAdult, extraNeeds);
		this.vipNr = vipNr;
		this.loungeCardNr = loungeCardNr;
	}

	@Override
	public String toString() {
		return "[" + getName() + " " + getSurname() + ", " + getIdenNr() + ", " + getIdType() + ", " + getNation() + ", " + vipNr + ", " + loungeCardNr + ", " + isAdult()
				+ ", " + getExtraNeeds() + ", " + getIdenNr() + ", " + ", " + getNation() + "]";
	}
}
