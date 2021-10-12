package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator{
    String site;
    String author;
    String path;

    public String website(){    //creates website folder
        String directory = path + site;
        File newFolder = new File(directory);   //create file
        newFolder.mkdirs(); //creates folder and returns directory
        return directory;
    }
    public String JSFolder(){   //creates JSFolder
        String directory = path + site + "/js";
        File newFolder = new File(directory);   //create file
        newFolder.mkdirs(); //creates folder and returns directory
        return directory;
    }
    public String CSSFolder(){  //creates CSSFolder
        String directory = path + site + "/css";
        File newFolder = new File(directory);   //create file
        newFolder.mkdirs(); //creates folder and returns directory
        return directory;
    }
    public String HTML(){   //creates HTML
        String directory = path + site + "/index.html";
        String html = "<title> "+site+ " </title>\n<meta> "+ author +" <meta>";
        File file = new File(directory);    //create file
        try {   //write in the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html);
            writer.close();
            return directory;
        }catch(Exception ex){
            return "Failure";
        }
    }
}
