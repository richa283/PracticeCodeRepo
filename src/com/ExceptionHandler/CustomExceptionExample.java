package com.ExceptionHandler;

//Custom exception class
class NegativeNumberException extends Exception
{
	public NegativeNumberException(String message)
	{
		super(message);
	}
}

//Method that throws the custom exception
public class CustomExceptionExample
{
	public static void calculateSquareRoot(double number) throws NegativeNumberException
	{
		if (number < 0)
		{
			throw new NegativeNumberException("Negative numbers are not allowed");
		}
		// Perform square root calculation
		double result = Math.sqrt(number);
		System.out.println("Square root of " + number + " is: " + result);
	}

	public static void main(String[] args)
	{
		try
		{
			calculateSquareRoot(25); // This will calculate the square root
			calculateSquareRoot(-5); // This will throw NegativeNumberException
		} catch (NegativeNumberException e)
		{
			System.out.println("Custom Exception caught: " + e.getMessage());
		}
	}
}

