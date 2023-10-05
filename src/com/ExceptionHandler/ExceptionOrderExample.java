package com.ExceptionHandler;

public class ExceptionOrderExample
{
    public static void main(String[] args)
    {
        try
        {
            int[] array = new int[3];
            System.out.println(array[5]); // This will throw an ArrayIndexOutOfBoundsException
            
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("Caught IndexOutOfBoundsException");
        } catch (Exception e)
        {
            System.out.println("Caught Exception");
        }
    }
}
