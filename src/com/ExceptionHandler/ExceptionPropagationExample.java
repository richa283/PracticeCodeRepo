package com.ExceptionHandler;

import java.io.IOException;

public class ExceptionPropagationExample
{
    public static void doSomething() throws IOException, NullPointerException
    {
        int[] array = null;
        try 
        {
            int value = array[0]; // This will throw a NullPointerException
        } catch (NullPointerException e)
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            throw e; // Re-throwing the exception
        }
        throw new IOException("An IOException occurred");
    }

    public static void main(String[] args) {
        try {
            doSomething(); // Call a method that throws exceptions
        } catch (IOException e)
        {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (NullPointerException e)
        {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
