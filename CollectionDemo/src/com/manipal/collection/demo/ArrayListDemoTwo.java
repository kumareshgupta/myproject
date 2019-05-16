package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;


public class ArrayListDemoTwo {

	public static void main(String[] args) {
		Movie movie = new Movie(123, "Bahubali", "Prabash");
		Integer iObj = 10;
		ArrayList friends = new ArrayList();
		
		friends.add("Anshuman");
		friends.add("Ravi");
		friends.add(movie); //we can not add Movie type because arraylist accepts only String
		friends.add("Farah");
		friends.add(iObj);
				
		int noOfFriends = friends.size();
		System.out.println(noOfFriends);
		
		System.out.println("Through Iterator.....");
		Iterator it = friends.iterator();
		while(it.hasNext()){
			String str = (String) it.next();
			System.out.println(str);
		}
		
		
		
	}

}
