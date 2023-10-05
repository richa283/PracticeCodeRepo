package validate;

import java.util.Scanner;

public class StringValidator2 
{
	public static boolean isStringValid(String input)
	{
		return input.chars().allMatch(Character::isLetter);
		
	}

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String str=sc.nextLine();
		System.out.println("" +isStringValid(str)); 
		
		
	}
}
