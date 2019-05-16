package com.manipal.collection.demo;

public class Movie implements Comparable{
	int movieId;
	String movieName;
	String leadRole;
	
	public Movie(int movieId, String movieName, String leadRole) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.leadRole = leadRole;
	}
	@Override
	public int compareTo(Object obj) {
		Movie m = (Movie) obj;
		
		return this.movieName.compareTo(m.movieName);
		
		/*if(this.movieId > m.movieId)
			return 1;
		else if (this.movieId == m.movieId)
			return 0;
		else
			return -1;
		*/
	}
	
	public boolean equals(Object obj){
		Movie m = (Movie) obj;
		if(this.movieId == m.movieId)
			return true;
		else
			return false;
		
		
		
	}
	
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadRole() {
		return leadRole;
	}
	public void setLeadRole(String leadRole) {
		this.leadRole = leadRole;
	}
	
	public String toString(){
		return this.movieId + "\t" + this.movieName+"\t" + this.leadRole;
	}

	
}
