package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieOneSortDemo {

	public static void main(String[] args) {
		MovieOne movie1 = new MovieOne(300, "Bahubali", "Prabash");
		MovieOne movie2 = new MovieOne(124, "Infinity War", "Chris");
		MovieOne movie3 = new MovieOne(125,"Avengers", "Surya");
		
		List<MovieOne> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
		Collections.sort(movies, new MovieIdComparator());
		for(Object movie : movies)
			System.out.println(movie);
	
		
		
	}

}
