package map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations {

	public static void main(String[] args) {
		
		//Creating a new HashMap
		HashMap<String, Integer> hashmap=new HashMap<>();
		
		//Adding key-value pair
		hashmap.put("Snehal", 24);
		hashmap.put("Muskan", 25);
		hashmap.put("Aishwarya", 23);
		hashmap.put("Utsavi", 30);
		
		//Printing the HashMap
		System.out.println("HashMap :" +hashmap);
		
		//Accessing a value using a key
		int muskanAge = hashmap.get("Muskan");
		System.out.println("Muskan is "+muskanAge+" years old !");
		
		//Checking if a key exists
		boolean containsUtsavi = hashmap.containsKey("Utsavi");
		System.out.println("Contains Utsavi? " +containsUtsavi);
		
		//Updating a value
		hashmap.put("Aishwarya", 24);
		System.out.println(hashmap);
		
		//removing a key-value pair
		hashmap.remove("Muskan");
		System.out.println(hashmap);
		
		//Iterating over the HashMap
		for(Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			String name=entry.getKey();
			int age=entry.getValue();
			System.out.println(name+ " : "+age);
		}
		//clearing the hashmap
		hashmap.clear();
		System.out.println("Hashmap is empty : "+hashmap.isEmpty());
		//System.out.println(hashmap);
		
	}
}
