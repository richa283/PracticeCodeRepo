package com.ExceptionHandler;

import java.io.*;

public class TryWithResourcesExample
{
    public static void main(String[] args)
    {
        // Using try-with-resources to automatically close the FileReader
        try (FileReader fileReader = new FileReader("example.txt"))
        {
            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = fileReader.read(buffer)) != -1)
            {
                System.out.print(new String(buffer, 0, charsRead));
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
