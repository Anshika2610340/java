import java.util.Scanner;
public class Practisequestion78 {
    public static void main(String[] args) {
        /* Write a program to assign a full path and file name as given below. Using library functions, extract and output the file path, file name and file extension separately as shown.
        Input
        C:\Users\admin\Pictures\flower.jpg
        Output
        Path: C:\Users\admin\Pictures\
        File name: flower
        Extension: jpg*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter full path");
        String path=sc.next();
        int pathindexid=path.lastIndexOf('\\');
        System.out.println("path is:\t"+path.substring(0,pathindexid));
        int dotindex=path.lastIndexOf(".");
        System.out.println("file name is:\t"+path.substring(pathindexid+1,dotindex));
        System.out.println("extension:\t"+path.substring(dotindex+1));
        sc.close();
    }
}