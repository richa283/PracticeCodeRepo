package com.ExceptionHandler;

public class ExceptionalHandlerDemo2 
{
	public static void main(String[] args)
	{
		
		String text = null;
		try 
		{
			int length = text.length(); //this will throw a null pointer exception
		}catch(NullPointerException e)
		{
			System.out.println("A null pointer exception has occured:" +e.getMessage());
		}
		finally {
			System.out.println("Program finished");
		}
		
		
		
	}
}
