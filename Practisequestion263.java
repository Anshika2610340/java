import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practisequestion263 {
    public static void main(String[] args) {
        /*Write a program to read a file*/
        File myfile=new File("sample.txt");
        try{
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
