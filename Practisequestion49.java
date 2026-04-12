import java.util.Scanner;
public class Practisequestion49 {
    public static void main(String[] args) {
        /*Using switch statement, write a menu driven program for the following:
        To find and display the sum of the series given below:
        S = x1 - x2 + x3 - x4 + x5 .......... - x20
        (where x = 2)
        To display the following series:
        1 11 111 1111 11111
        For an incorrect option, an appropriate error message should be displayed. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for series");
        System.out.println("enter 2 for pattern");
        System.out.println();
        System.out.println("enter choice");
        int ch=sc.nextInt();
        int x=2;
        switch(ch){
            case 1:
                double s=0;
                for(int i=0;i<20;i++){
                    s=s+(Math.pow(-1, i)*Math.pow(x, i+1));
                }
                System.out.println("sum of series is:"+s);
                break;
            case 2:
                int num=1;
                for(int i=1;i<=5;i++){
                    System.out.print(num+" ");
                    num=num*10+1;
                }
                break;
            default:
                System.out.println("invalid choice");
        }
        sc.close();
    }
}