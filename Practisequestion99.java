import java.util.Scanner;
public class Practisequestion99 {
    public static void main(String[] args) {
        /*Define a class to accept values into a 3x3 integer array and print the product of each row elements. */
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("enter the elements in the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
           }
        }
        int prod=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                prod*=arr[i][j];
           }
           System.out.println("product="+prod);
           prod=1;
        }
        sc.close();
    }
}