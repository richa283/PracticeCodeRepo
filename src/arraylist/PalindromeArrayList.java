package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> words=new ArrayList<>();
		words.add("level");
		words.add("Car");
		words.add("Yellow");
		
		ArrayList<String> reverseString =new ArrayList<>(words);
		Collections.reverse(reverseString);
		
		boolean isPalindrome = words.equals(reverseString);
		System.out.println("Is Palindrome : " +isPalindrome);
	}
}
