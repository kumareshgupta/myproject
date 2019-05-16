package com.manipal.collection.demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {

	public static void main(String[] args) {

		Movie movie1 = new Movie(300, "Bahubali", "Prabash");
		Movie movie2 = new Movie(124, "Infinity War", "Chris");
		Movie movie3 = new Movie(125,"Avengers", "Surya");
		
		Queue <Movie> q = new PriorityQueue<Movie>();
		
		q.add(movie1);
		q.add(movie2);
		q.add(movie3);
		System.out.println(q);
		
		
		
			
		
	}

}
