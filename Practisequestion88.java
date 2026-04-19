import java.util.Scanner;
public class Practisequestion88 {
    public static void main(String[] args) {
        /*Define a class to declare an array of size twenty of double datatype, accept the elements into the array and perform the following :
        Calculate and print the product of all the elements.
        Print the square of each element of the array. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        double arr[]=new double[n];
        System.out.println("enter the elements in array");
        double p=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            p*=arr[i];
        }
        System.out.println("product="+p);
        for(int i=0;i<n;i++){
            System.out.println("square="+arr[i]*arr[i]);
        }
        sc.close();
    }
}