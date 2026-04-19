import java.util.Scanner;
public class Practisequestion97 {
    public static void main(String[] args) {
        /*Define a class to accept values into a 4 × 4 integer array. Calculate and print the NORM of the array.
        NORM is the square root of sum of squares of all elements. */
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[4][4];
        System.out.println("enter elements in array");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr1[i][j]=sc.nextInt();
           }
        }
        double sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum+=(arr1[i][j]*arr1[i][j]);
            }
        }
        System.out.println("norm="+Math.sqrt(sum));
        sc.close();
    }
}