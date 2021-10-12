/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


package ex46;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class ex46 {
    static void frequencyOfWords(String string) //counts teh frequency of words
    {
        Map<String,Integer> map=new TreeMap<>();
        String[] array =string.split(" ");  //splits to find the words
        for (String i : array) {
            if (map.containsKey(i)) {    //if array element is there then hash map
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet())     //loop over the elements of the hash map
        {
            System.out.print(entry.getKey()+
                    " : ");
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print("*");
            }

            System.out.print("\n\n");
        }
    }
    public static String readFile(String path, Charset hide) throws IOException //reads the file and puts into a single string
    {
        String words;
        try (Scanner inputs = new Scanner(new File(path), String.valueOf(hide))) {
            words = inputs.useDelimiter("\\A").next();
        }

        return words;
    }

    public static void main(String[] args)
    {
        String inputFile = "exercise46_input.txt";
        String input = null;
        try {
            input = readFile(inputFile, StandardCharsets.UTF_8);
            input = input.replaceAll("([\\r\\n\\t])", " ");
            input=input.replaceAll("\\s+"," ").trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        frequencyOfWords(Objects.requireNonNull(input));
    }
}
