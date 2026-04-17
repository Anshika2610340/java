import java.util.Scanner;
public class Practisequestion77{
    public static void main(String[] args) {
        /*Write a program to input 10 integer elements in an array and sort them in descending order using bubble sort technique. */
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter the elements of an array");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("displaying elements of an array");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}