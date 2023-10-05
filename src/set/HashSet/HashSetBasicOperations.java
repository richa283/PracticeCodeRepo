package set.HashSet;

import java.util.HashSet;

public class HashSetBasicOperations {

	public static void main(String[] args) {
		
		//Creating a new HashSet
		HashSet<String> hashSet=new HashSet<>();
		
		//Adding elements
		hashSet.add("Apple");
		hashSet.add("Mango");
		hashSet.add("Banana");
		hashSet.add("Orange");
		
		//Printing the HashSet
		System.out.println("HashSet : "+hashSet);
		
		//Iterating over a HashSet using a enhanced for loop
		System.out.print("HashSet elements (using enhanced for loop): ");
		for(String element : hashSet) {
			System.out.println(element + " ");
		}
		System.out.println( );
		
		//Clearing the HasSet
		hashSet.clear();
		System.out.println("HashSet is empty : "+hashSet.isEmpty());
	}
	
}
