package com.manipal.collection.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> sqlErrors = new HashMap<>();
		sqlErrors.put("007", "Statement contains illegal character");
		sqlErrors.put("105", "Invalid String");
		sqlErrors.put("104", "Illegal Symbol");
		sqlErrors.put("029", "Into Class Required");
		
		Iterator ite =sqlErrors.values().iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("--------------Values : "+sqlErrors.values());
		
		String message = sqlErrors.get("105");
		System.out.println(message);
		
		Set<String> errorCodeSet = sqlErrors.keySet();
		Iterator<String> it = errorCodeSet.iterator();
		
		while(it.hasNext()){
			String errorCode = it.next();
			String errorMessage = sqlErrors.get(errorCode);
			
			System.out.println(errorCode + "\t : " + errorMessage);
		}
	}

}
