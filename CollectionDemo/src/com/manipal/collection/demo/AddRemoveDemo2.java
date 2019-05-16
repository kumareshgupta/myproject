package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddRemoveDemo2 {

	public static void main(String[] args) {
		List<String> basket  = new ArrayList<>();
		basket.add("Mango");
		basket.add("Pomegranate");
		basket.add("Grapes");
		basket.add("Blackberry");
		System.out.println(basket);

	
		System.out.println("Basket : "+ basket);
		
		Set<String> fruits  = new TreeSet<>();
		fruits.add("Watermelon");
		fruits.add("Banana");
		fruits.add("Cheeku");
		System.out.println("Fruits : " + fruits);

		basket.addAll(fruits);
		
		System.out.println("After aDding :- " + basket);
		
		basket.retainAll(fruits); // keep all the fruits in basket
		
		System.out.println("After REtaining fruits : " +basket);
		
		
		
		
	//	basket.removeAll(fruits); // remove it
		//System.out.println("After Removing fruits :- " + basket);
		
		
		
		
	}

}
