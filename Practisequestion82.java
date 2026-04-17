import java.util.Scanner;
public class Practisequestion82 {
    public static void main(String[] args) {
        /*Write a program to input integer elements into an array of size 20 and perform the following operations:
        Display largest number from the array.
        Display smallest number from the array.
        Display sum of all the elements of the array */
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        System.out.println("enter the elements in array");
        for(int i=0;i<20;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,min=arr[0],sum=0;
        for(int i=0;i<20;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("minimum value:"+min);
        System.out.println("maximum value:"+max);
        System.out.println("sum is:"+sum);
        sc.close();
    }
}