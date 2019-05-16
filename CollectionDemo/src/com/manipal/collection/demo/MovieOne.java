package com.manipal.collection.demo;

public class MovieOne{
	int movieId;
	String movieName;
	String leadRole;
	
	public MovieOne(int movieId, String movieName, String leadRole) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.leadRole = leadRole;
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
