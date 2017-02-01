package model;


public class Movie {

	
	private String title;
	private	Genre genre;
	private int year;
	private Director director;
	
	
	//Constructors
	public Movie(){
		this.title = "";
		this.genre = Genre.Comedy;
		this.year = 2000;
		this.director=null;
	}
	
	public Movie(String title, Genre genre, int year,Director director){
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.director=director;
	}

	
	

	//Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	
}
