package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieListDemo {

	public static void main(String[] args) {

		Movie movie1 = new Movie(123, "Bahubali", "Prabash");
		Movie movie2 = new Movie(124, "Infinity War", "Chris");
		Movie movie3 = new Movie(125,"24", "Surya");
		
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
		Movie m = new Movie(125,"24", "Surya");
		System.out.println(movies.contains(m));
		
		
		/*for(Movie movie : movies){
			System.out.println(movie);
		}*/
		
		Iterator iter = movies.iterator();
		
		/*while(iter.hasNext()){
			System.out.println(iter.next());
		}*/
		
	}

}








