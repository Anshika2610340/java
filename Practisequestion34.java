import java.util.Scanner;
public class Practisequestion34 {
    public static void main(String[] args) {
        /*Write a menu driven program to perform the following tasks by using Switch case statement:

        (a) To print the series:
        0, 3, 8, 15, 24, ............ to n terms. (value of 'n' is to be an input by the user)

        (b) To find the sum of the series:
        S = (1/2) + (3/4) + (5/6) + (7/8) + ........... + (19/20) */
        Scanner sc=new Scanner(System.in);
        System.out.println("choose 1 to print series");
        System.out.println("0,3,8,15,24,.............upto n terms");
        System.out.println("choose 2 to print the sum");
        System.out.println("s=(1/2)+(3/4)+(5/6)+(7/8)+........+(19/20)");
        System.out.println();
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("enter the value of n");
                int n=sc.nextInt();
                for(int i=1;i<(n+1);i++){
                    System.out.print(((i*i)-1)+" ");
                };
                break;
            case 2:
                double sum=0;
                for(int i=1;i<20;i=i+2){
                    sum+=(double)i/(i+1);
                }
                System.out.println("Sum= "+sum);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}