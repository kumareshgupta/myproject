package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList friends = new ArrayList();
		friends.add("Anshuman");
		friends.add("Ravi");
		friends.add("Amit");
		friends.add("Farah");
		
		System.out.println(friends);
		
		String name = "Farah";
		System.out.println(friends.contains(name));
		
		
		
		int noOfFriends = friends.size();
		/*System.out.println(noOfFriends);
		
		//Option 1 to traverse elements of ArrayList
		for(int i = 0; i < noOfFriends; i++){
		System.out.println(friends.get(i));
		}
		
		//Option 2
		for( Object friend : friends){
			String f = (String) friend;
			System.out.println(f);
		}	
		//Option 3
		System.out.println("Through Iterator.....");
		Iterator it = friends.iterator();
		while(it.hasNext()){
			String str = (String) it.next();
			System.out.println(str);
		}
		
		*/
		
		//Option 4
		
		
		
	}

}
