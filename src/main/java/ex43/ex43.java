/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex43;

import java.util.*;
import java.io.*;

public class ex43{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner for input

        String site;
        String author;
        String CSS;
        String JS;

        System.out.print("Site name: ");
        site = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        JS = input.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        CSS = input.nextLine();

        WebsiteGenerator website = new WebsiteGenerator();  //website generator object

        //sets website attributes
        website.site = site;
        website.author = author;
        website.path = "src/main/java/";

        //creates wesbite and HTML
        System.out.println("Created " + website.website());
        System.out.println("Created " + website.HTML());

        if (JS.equals("y"))     //if yes create JSFolder
            System.out.println("Created " + website.JSFolder());
        if (CSS.equals("y"))    //if yes create CSSFolder
            System.out.println("Create " + website.CSSFolder());
    }

}
