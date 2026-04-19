import java.util.Scanner;
public class Practisequestion92 {
    public static void main(String[] args) {
        /*Define a class to accept values in integer array of size 10. Find sum of one digit number and sum of two digit numbers entered. Display them separately.
        Example:
        Input: a[ ] = {2, 12, 4, 9, 18, 25, 3, 32, 20, 1}
        Output:
        Sum of one digit numbers : 2 + 4 + 9 + 3 + 1 = 19
        Sum of two digit numbers : 12 + 18 + 25 + 32 + 20 = 107 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<10){
                sum1+=arr[i];
            }
            else if(arr[i]>10 && arr[i]<100){
                sum2+=arr[i];
            }
        }
        System.out.println("sum of one digit number:"+sum1);
        System.out.println("sum of two digit number:"+sum2);
        sc.close();
    }
}