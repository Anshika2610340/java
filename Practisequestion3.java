import java.util.Scanner;
public class Practisequestion3 {
    /*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

    Test Data
    Input an integer between 0 and 1000: 565
    Expected Output :
    The sum of all digits in 565 is 16
 */
    public static void main(String[] args) {
        int number,sum,digit1,remnumber,digit2,digit3,digit4;
        System.out.print("input an number between 0 and 1000: ");
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();
        sum=0;
        digit1=number%10;
        remnumber=number/10;
        digit2=remnumber%10;
        remnumber=remnumber/10;
        digit3=remnumber%10;
        remnumber=remnumber/10;
        digit4=remnumber%10;
        remnumber=remnumber/10;
        sum=digit1+digit2+digit3+digit4;
        System.out.println("The sum of all digits in "+number+" is "+sum);
        sc.close();
    }
}

