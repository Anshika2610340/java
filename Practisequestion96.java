import java.util.Scanner;
public class Practisequestion96 {
    public static void main(String[] args) {
        /*Define a class to accept values into 4x4 array and find and display the sum of each row. */
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        System.out.println("enter elements in array");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("sum="+sum);
            sum=0;
        }
        sc.close();
    }
}