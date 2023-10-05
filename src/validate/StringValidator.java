package validate;

import java.util.Scanner;

public class StringValidator 
{
	public static boolean isStringValid(String input)
	{
		return input.matches("[a-zA-Z]+");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String str = sc.nextLine();
		System.out.println("checking validity:" +isStringValid(str));
	}

}
