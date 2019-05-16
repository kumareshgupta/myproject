package com.manipal.collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> hObj = new HashSet<>();
		hObj.add("Bhagya Sree");
		hObj.add("Raj");
		hObj.add("Amrita");
		hObj.add("Rahul");
		hObj.add("Raj");
		//hObj.add(100);
		
		System.out.println(hObj);
		
		for(Object name : hObj){
			String n = (String) name;
			System.out.println(n);
		}
		
		System.out.println("........Using Iterator.....");
		Iterator it = hObj.iterator();
		while(it.hasNext()){
			String n = (String) it.next();
			System.out.println(n);
		}
		
		
		System.out.println(hObj.contains("Amritaa"));
		
		
		
		
		
	}

}
