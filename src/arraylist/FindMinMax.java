package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinMax {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(123);
		numbers.add(345);
		numbers.add(567);
		numbers.add(890);
		numbers.add(457);
		numbers.add(121);
		
		int min = Collections.min(numbers);
		int max = Collections.max(numbers);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		
	}
}
