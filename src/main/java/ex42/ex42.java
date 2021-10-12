/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex42;

import java.util.*;
import java.io.*;

public class ex42 {

    public void details(String exercise42) {
        try {
            File inputFile = new File(exercise42); //creates file
            Scanner input = new Scanner(inputFile);

            while (input.hasNext()) {
                String space = input.nextLine();
                String[] CSV = space.split(",");    //comma separated values
                System.out.printf("%-17s%-17s%-17s\n", CSV[0], CSV[1], CSV[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }


    public static void main(String[] args) {

        ex42 print = new ex42();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        print.details("exercise42_input.txt");
    }
}