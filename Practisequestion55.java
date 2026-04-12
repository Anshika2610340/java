import java.util.Scanner;
public class Practisequestion55 {
    public static void main(String[] args) {
        /*A tech number has even number of digits. If the number is split in two equal halves, then the square of sum of these halves is equal to the number itself. Write a program to generate and print all four digits tech numbers. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int firsthalf=num%100;
        int secondhalf=num/100;
        int sum=firsthalf+secondhalf;
        if(num==sum*sum){
            System.out.println("tech number");
        }
        else{
            System.out.println("not a tech number");
        }
        sc.close();
    }
}