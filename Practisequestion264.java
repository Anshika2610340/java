import java.io.File;
public class Practisequestion264 {
    public static void main(String[] args) {
        /*write a program to delete a file*/
        File myfile=new File("sample.txt");
        if(myfile.delete()){
            System.out.println("I have deleted: "+myfile.getName());
        }
        else{
            System.out.println("some error occured");
        }
    }
}
