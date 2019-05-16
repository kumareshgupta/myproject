package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSortDemo {

	public static void main(String[] args) {
		Movie movie1 = new Movie(300, "Bahubali", "Prabash");
		Movie movie2 = new Movie(124, "Infinity War", "Chris");
		Movie movie3 = new Movie(125,"Avengers", "Surya");
		
		List<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
		Collections.sort(movies);
		for(Object movie : movies)
			System.out.println(movie);
	
		
		
	}

}
