import java.util.Scanner;
public class Practisequestion95 {
    public static void main(String[] args) {
        /*Define a class to accept values into an integer array of order 4 x 4 and check whether it is a DIAGONAL array or not. An array is DIAGONAL if the sum of the left diagonal elements equals the sum of the right diagonal elements. Print the appropriate message.
        Example:
        3 4 2 5
        2 5 2 3
        5 3 2 7
        1 3 7 1
        Sum of the left diagonal element = 3 + 5 + 2 + 1 = 11
        Sum of the right diagonal element = 5 + 2 + 3 + 1 = 11 */
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        System.out.println("enter element in the matrix:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int rsum=0,lsum=0;
        for(int i=0;i<4;i++){
                rsum+=arr[i][i];
                lsum+=arr[i][3-i];
        }
        if(lsum==rsum){
            System.out.println("diagonal matrix");
        }
        else{
            System.out.println("it is not a diagonal matrix");
        }
        sc.close();
    }
}