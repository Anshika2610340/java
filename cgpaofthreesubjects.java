import java.util.Scanner;

public class cgpaofthreesubjects{
    public static void main(String[] args){
        System.out.println("enter the marks of three subjects");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float cgpa = (a + b + c) / 3.0f;
        System.out.println("the cgpa of the student is:"+cgpa);
        sc.close();
    }
}
