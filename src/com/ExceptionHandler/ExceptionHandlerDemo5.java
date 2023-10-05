package com.ExceptionHandler;

public class ExceptionHandlerDemo5
{
	public static void main(String[] args)
	{
		try
		{
			int num = Integer.parseInt("abc"); //this will throw NumberFormatException
		}catch(NumberFormatException e)
		{
			System.out.println("Number format exception: " +e.getMessage());
		}
	}
}
