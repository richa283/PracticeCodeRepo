package arraylist;

import java.util.ArrayList;

public class ArrayListBasicOperations {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers);
		System.out.println("Contains 20 : " +numbers.contains(20));
		System.out.println("Index of 30 : "+numbers.indexOf(30));
	}
}
