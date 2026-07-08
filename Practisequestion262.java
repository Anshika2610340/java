import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practisequestion262 {
    public static void main(String[] args) {
        /*Write a program to write a file*/
        try{
            FileWriter filewriter=new FileWriter("sample.txt");
            filewriter.write("this is my first file");
            filewriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
