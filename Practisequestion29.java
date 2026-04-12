import java.util.Scanner;
public class Practisequestion29 {
    public static void main(String[] args) {
        /*Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between 1 to 7");
        int a=sc.nextInt();
        if(a<1||a>7){
            System.out.println("invalid choice");
        }
        switch(a){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
        sc.close();
    }
}