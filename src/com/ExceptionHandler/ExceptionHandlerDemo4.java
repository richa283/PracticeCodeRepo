package com.ExceptionHandler;

public class ExceptionHandlerDemo4 {
	public static void main(String[] args)
	{
		int[] numbers = {1,2,3};
		try
		{
			int value = numbers[5]; //this will throw ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound: " +e.getMessage());
		}
	}
}
