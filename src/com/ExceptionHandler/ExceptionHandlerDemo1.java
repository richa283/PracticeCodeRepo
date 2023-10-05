package com.ExceptionHandler;

import java.util.Scanner;

public class ExceptionHandlerDemo1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			System.out.print("Input 1: ");
			int a = scanner.nextInt();
			System.out.print("Input 2: ");
			int b = scanner.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("An arithmetic exception occured:" +ex.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("Program finished");
		}
	}
}