package com.ExceptionHandler;

import java.io.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("example.txt");
            // Code that uses the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
