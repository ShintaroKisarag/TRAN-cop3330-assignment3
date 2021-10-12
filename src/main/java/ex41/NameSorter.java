/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


package ex41;
import java.io.*;
import java.util.*;


public class NameSorter {
    public static void readList(Scanner inputFile, ArrayList<String>names){ //reads the data and puts in array
        while(inputFile.hasNextLine()){
            names.add(inputFile.nextLine());
        }
    }
    public static void outputList(ArrayList<String>name)throws IOException{    //prints the names in the output file
        FileWriter output = new FileWriter("exercise41_output.txt");    //creates output file
        output.write("Total of "+ name.size()+" names\n");
        output.write("-----------------\n");
        for(String i:name){
            output.write(i+"\n");
        }
        output.close(); //closes output file
    }

    public static void main(String[] args) throws FileNotFoundException{
        File input = new File("exercise41_input.txt");  //creates input file
        Scanner inputFile = new Scanner(input); //scanner
        ArrayList<String>name = new ArrayList<String>();   //Store names
        readList(inputFile,name);  //gets name from input list
        inputFile.close();
        try{
            outputList(name);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}



