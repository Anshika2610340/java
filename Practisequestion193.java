import java.util.Scanner;
public class Practisequestion193 {
    public static void main(String[] args) {
        /*Write a Java program that throws an exception and catch it using a try-catch block.*/
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("enter the index of array you want to divide:");
            int ind=sc.nextInt();
            System.out.println("enter the value by which you want to divide:");
            int number=sc.nextInt();
            int c=arr[ind]/number;
            System.out.println("output is:"+c);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
        }catch(Exception e){
            System.out.println("some other exception occured!");
        }
    }
}
