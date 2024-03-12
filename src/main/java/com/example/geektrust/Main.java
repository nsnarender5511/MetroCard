package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Split the line into an array of strings using space as a delimiter
                String[] request = line.split(" ");
                MetroCorp.getMetroCorp().processRequest(request);
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
            System.out.println("Exceptionnnnnnnnnn !!!");
        }
    }
}
