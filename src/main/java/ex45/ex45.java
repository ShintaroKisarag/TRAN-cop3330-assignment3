/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */



package ex45;
import java.io.*;
import java.util.*;


public class ex45 {
    static class readFile{
        private final ArrayList<String>list;
        private final Scanner input;

        public readFile()throws IOException{    //creates file and scanner
            list = new ArrayList<>();
            File inputFile = new File("exercise45_input.txt");
            input = new Scanner(inputFile);
        }
        public void readLine(){ //reads file line by line
            try{
                while(input.hasNext()){
                    String data = input.nextLine();
                    list.add(data);
                }
            }
            finally{
                input.close();
            }
        }
        public ArrayList<String> getList(){
            return list;    //return list
        }
    }

    static class WriteFile{ //writing in output file
        private final FileWriter writer;
        private final ArrayList<String> list;

        public WriteFile(String name, ArrayList<String>list)throws IOException{
            writer = new FileWriter(name);
            this.list = list;
        }
        public void writeFile()throws IOException{
            for (String temp : list) {
                String string = "utilize";
                int index = 0;
                while (true) {
                    index = temp.indexOf(string, index);
                    if (index != -1) {
                        index += string.length();
                    } else {
                        break;
                    }
                }
                temp = temp.replaceAll("utilize", "use");    //replace utilizes with use
                writer.write(temp + "\n");    //writes in file
            }
            writer.close(); //closes writer
        }
    }

    public static void main(String[]args)throws IOException{
        Scanner input = new Scanner(System.in); //scanner
        System.out.print("\nEnter the output file: ");  //asks for output file
        String output = input.next();
        readFile readFile = new readFile(); //readFile class
        readFile.readLine();
        ArrayList<String>list = readFile.getList(); //gets the content of the file
        WriteFile writeFile = new WriteFile(output,list);
        writeFile.writeFile();  //writes in output file
    }
}
