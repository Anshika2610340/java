import java.util.Scanner;
public class Practisequestion40 {
    public static void main(String[] args) {
        /*Using the switch statement, write a menu driven program:
        To check and display whether a number input by the user is a composite number or not.
        A number is said to be composite, if it has one or more than one factors excluding 1 and the number itself.
        Example: 4, 6, 8, 9...
        To find the smallest digit of an integer that is input:
        Sample input: 6524
        Sample output: Smallest digit is 2
        For an incorrect choice, an appropriate error message should be displayed. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for checking composite number");
        System.out.println("enter 2 for finding smallest number");
        System.out.println();
        System.out.println("enter a choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter a number");
                int num=sc.nextInt();
                int count=0;
                for(int i=2;i<num;i++){
                    count++;
                }
                if(count>0){
                    System.out.println("composite number");
                }
                else{
                    System.out.println("not a composite number");
                }
                break;
            case 2:
                System.out.println("enter a number");
                int num1=sc.nextInt();
                int min=num1%10;
                int d;
                while(num1!=0){
                    d=num1%10;
                    num1/=10;
                    if(d<min){
                        min=d;
                    }
                }
                System.out.println("minimum element:"+min);
                break;
        
            default:
                System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}