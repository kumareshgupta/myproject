package com.manipal.collection.demo;

import java.util.Comparator;

public class MovieIdComparator implements Comparator<MovieOne> {

	@Override
	public int compare(MovieOne m1, MovieOne m2) {
		if(m1.movieId > m2.movieId)
			return 1;
		else if(m1.movieId == m2.movieId)
			return 0;
		else
			return -1;
	}

	

}
