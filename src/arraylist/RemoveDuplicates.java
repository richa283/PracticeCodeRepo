package arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(40);
		
		HashSet<Integer> set = new HashSet<>(numbers);
		numbers.clear();
		numbers.addAll(set);
		System.out.println(numbers);
	}
}
