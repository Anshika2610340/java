import java.util.Scanner;
public class Practisequestion113 {
    public static void print(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void print(int n){
        int odd=0;
        int even=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            if(digit%2!=0){
                odd+=digit;
            }
            else{
                even+=digit;
            }
            n/=10;
        }
        if(odd==even){
            System.out.println(temp+" is a lead number");
        }
        else{
            System.out.println(temp+" is not a lead number");
        }
    }
    public static void main(String[] args) {
        /*Define a class to overload the function print as follows:
        void print() - to print the following format
        1  1  1  1
        2  2  2  2
        3  3  3  3
        4  4  4  4
        5  5  5  5
        void print(int n) - To check whether the number is a lead number. A lead number is the one whose sum of even digits are equal to sum of odd digits.
        e.g. 3669
        odd digits sum = 3 + 9 = 12
        even digits sum = 6 + 6 = 12
        3669 is a lead number. */
        Scanner sc=new Scanner(System.in);
        print();
        System.out.println("enter a integer:");
        int a=sc.nextInt();
        print(a);
        sc.close();
    }
}