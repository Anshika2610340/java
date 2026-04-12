import java.util.Scanner;
public class Givennoisgreater {
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>8);
        sc.close();
    }
}