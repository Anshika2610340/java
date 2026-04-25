import java.util.Scanner;
public class Practisequestion114 {
    public static void display(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
        }
        System.out.println();
        }
    }
    public static void display(int n){
        while(n!=0){
            int digit=n%10;
            System.out.println(Math.sqrt(digit));
            n/=10;
        }
    }
    public static void main(String[] args) {
        /*Define a class to overload the method display as follows:
        void display( ): To print the following format using nested loop
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        void display(int n): To print the square root of each digit of the given number.
        Example:
        n = 4329
        Output – 3.0
        1.414213562
        1.732050808
        2.0 */
        Scanner sc=new Scanner(System.in);
        display();
        System.out.println("enter a integer:");
        int a=sc.nextInt();
        display(a);
        sc.close();
    }
}