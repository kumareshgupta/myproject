package com.manipal.collection.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mapCountryCodes = new TreeMap<>();
		 
		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kingdom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");
		 
		Set <String> keys = mapCountryCodes.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String c = it.next();
			String n = mapCountryCodes.get(c);
			System.out.println();
			System.out.println(c + " " + n );
		}
	}

}
