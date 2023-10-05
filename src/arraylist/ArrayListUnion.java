package arraylist;

import java.util.ArrayList;

public class ArrayListUnion {

	public static void main(String[] args) {
		
		ArrayList<Integer> array1=new ArrayList<>();
		array1.add(10);
		array1.add(20);
		array1.add(30);
		
		ArrayList<Integer> array2=new ArrayList<>();
		array2.add(30);
		array2.add(40);
		array2.add(50);
		
		array1.addAll(array2);
		System.out.println(array1);
	}
	
	
}
