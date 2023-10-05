package com.ExceptionHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlerDemo3 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader filereader = new FileReader("newfile.txt"); //this will throw a file not found exception
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found:" +e.getMessage());
		}
		finally
		{
			System.out.println("Program finished");
		}
	}
}
