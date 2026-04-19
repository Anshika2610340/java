import java.util.Scanner;
public class Practisequestion100 {
    public static void main(String[] args) {
        /*Define a class to accept 10 integers in an array, search for the given value using the Linear Search technique and print appropriate messages. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        int idx=0;
        boolean ch=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                idx=i;
                ch=true;
                break;
            }
        }
        if(ch==true){
            System.out.println("element found at position="+(idx+1));
        }
        else{
            System.out.println("key not found");
        }
        sc.close();
    }
}