package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		List<String> basket  = new ArrayList<>();
		basket.add("Mango");
		basket.add("Pomegranate");
		basket.add("Grapes");
		basket.add("Blackberry");
		System.out.println("Before Sorting : " + basket);
		
		Collections.sort(basket);
		
		System.out.println("After Sorting : " + basket);
		
		
		
		
		
	}

}
