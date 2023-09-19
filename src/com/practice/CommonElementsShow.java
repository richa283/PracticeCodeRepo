package com.practice;

import java.util.ArrayList;

public class CommonElementsShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> even = new ArrayList<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		even.add(14);
		even.add(16);
		even.add(18);
		even.add(20);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		System.out.println("Showing commom element between two arrayList:");

		for(Integer number : even) //This part declares a variable number of type Integer that will be used to hold the elements of the even ArrayList one at a time. In other words, it declares a loop variable.
		{
			if(numbers.contains(number))
			{
				System.out.println(number+ "");
			}
		}
	}

}
