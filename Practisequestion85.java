import java.util.Scanner;
public class Practisequestion85 {
    public static void main(String[] args) {
        /*Write a program to input 15 integer elements in an array and sort them in ascending order using the bubble sort technique. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}