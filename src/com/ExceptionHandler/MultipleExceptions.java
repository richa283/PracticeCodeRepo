package com.ExceptionHandler;

public class MultipleExceptions
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr = {1,2,3,4,5,6};
			int value = arr[10];
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound: " +e.getMessage());
		}catch(Exception e)
		{
			System.out.println("Other error: " +e.getMessage());
		}
	}
}