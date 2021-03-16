package model;

public class Person {
	private String name;
	private String surname;
	private String idenNr;
	private IdenType idType;
	private Nationality nation;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getIdenNr() {
		return idenNr;
	}
	
	public void setIdenNr(String idenNr) {
		this.idenNr = idenNr;
	}
	
	public IdenType getIdType() {
		return idType;
	}
	
	public void setIdType(IdenType idType) {
		this.idType = idType;
	}
	
	public Nationality getNation() {
		return nation;
	}
	
	public void setNation(Nationality nation) {
		this.nation = nation;
	}
	
	public Person() {
		super();
		this.name = "";
		this.surname = "";
		this.idenNr = "";
		this.idType = IdenType.IDCARD;
		this.nation = Nationality.ESTONIAN;
	}
	
	public Person(String name, String surname, String idenNr, IdenType idType, Nationality nation) {
		super();
		this.name = name;
		this.surname = surname;
		this.idenNr = idenNr;
		this.idType = idType;
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "[" + name + " " + surname + ", " + idenNr + ", " + idType + ", " + nation + "]";
	}	
}