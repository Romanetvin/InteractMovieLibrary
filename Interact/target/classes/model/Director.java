package model;

public class Director {
	
	private String name;
	private String fisrtName;
	private int dateOfBirth;
	
	
	
	public Director(){
		this.name="";
		this.fisrtName="";
		this.dateOfBirth=0;
	}
	
	public Director(String name, String fisrtName, int dateOfBirth) {
		super();
		this.name = name;
		this.fisrtName = fisrtName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
}
