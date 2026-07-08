import java.io.File;
import java.io.IOException;

public class Practisequestion261 {
    public static void main(String[] args) {
        /*Write a program to create a text file*/
        File myfile=new File("sample.txt");
        try{
            myfile.createNewFile();
        }catch(IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }
    }
}
