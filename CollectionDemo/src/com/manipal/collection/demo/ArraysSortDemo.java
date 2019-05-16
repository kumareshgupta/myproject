package com.manipal.collection.demo;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {

		int [] luckyNumbers = {7,3,9,2,5};
		
		Arrays.sort(luckyNumbers);
		
		for(int num : luckyNumbers){
			System.out.print(num + " ");
		}
		
	}

}
