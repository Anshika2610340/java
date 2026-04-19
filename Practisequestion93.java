import java.util.Scanner;
public class Practisequestion93 {
    public static void main(String[] args) {
        /*Define a class to accept values in integer array of size 10. Sort them in an ascending order using selection sort technique. Display the sorted array. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selection sort technique
        int idx=0;
        for(int i=0;i<n-1;i++){
            idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[idx]){
                    idx=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[idx];
            arr[idx]=t;
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}