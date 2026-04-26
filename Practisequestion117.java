import java.util.Scanner;
public class Practisequestion117 {
    public static void print(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j%2==0){
                    System.out.print('#');
                }
                else{
                    System.out.print('@');
                }
            }
            System.out.println();
        }
    }
    public static double print(double a,double b){
        double sum=0;
        for(double i=a;i<=b;i+=0.5){
            sum+=i;
        }
        return sum;
    }
    public static int print(char ch1,char ch2){
        if(ch1>ch2){
            return (int)ch1;
        }
        else{
            return (int)ch2;
        }
    }
    public static void main(String[] args) {
        /*Define a class to overload the method print() as follows:
        void print() – To print the given format using nested loops.
        @#@#@
        @#@#@
        @#@#@
        @#@#@
        double print(double a, double b) – To display the sum of numbers between a and b with difference of 0.5.
        e.g. if a = 1.0, b = 4.0
        Output is: 1.0 + 1.5 + 2.0 + 2.5 + … + 4.0
        int print(char ch1, char ch2) – Compare the two characters and return the ASCII code of the largest character. */
        Scanner sc=new Scanner(System.in);
        print();
        System.out.println("enter the values of a nad b:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(print(a,b));
        System.out.println("enter the vaues of ch1 and ch2:");
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(print(ch1,ch2));
        sc.close();
    }
}
