package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(300);
		numbers.add(200);
		numbers.add(100);
		numbers.add(230);
		numbers.add(175);
		
		Collections.sort(numbers);
		System.out.println(numbers);
	}

}
