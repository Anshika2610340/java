import java.util.Scanner;
public class Practisequestion53 {
    public static void main(String[] args) {
        /*Using the switch-case statement, write a menu driven program to do the following:
        (a) To generate and print Letters from A to Z and their Unicode
        Letters	Unicode
        A	65
        B	66
        .	.
        .	.
        .	.
        Z	90
        (b) Display the following pattern using iteration (looping) statement:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for unicodes");
        System.out.println("enter 2 for pattern");
        System.out.println();
        System.out.println("enter choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("letters\tunicode");
                for(int i=65;i<=90;i++){
                    System.out.println((char)i+"\t"+i);
                }
                break;
            case 2:
                for(int i=0;i<5;i++){
                    for(int j=1;j<=i+1;j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
                default:
                    System.out.println("invalid choice");
        }
        sc.close();
    }
}