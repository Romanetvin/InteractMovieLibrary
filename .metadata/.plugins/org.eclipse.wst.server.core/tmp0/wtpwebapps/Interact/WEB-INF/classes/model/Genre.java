package model;

public enum Genre {

	Action("Action"),
	Adventure("Adventure"),
	Comedy("Comedy"),
	Crime("Crime"),
	Drama("Drama"),
	SciFi("Science Fiction"),
	Western("Western");
	
	private String genre="";
	
	Genre(String genre){
		this.genre = genre;
	}
	
	public String toString(){
		return genre;
	}
}
