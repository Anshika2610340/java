import java.util.Scanner;
public class Practisequestion83 {
    public static void main(String[] args) {
        /*Write a program to input forty words in an array. Arrange these words in descending order of alphabets, using selection sort technique. Print the sorted array. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[idx].compareToIgnoreCase(arr[j])<0){
                    idx=j;
                }
                String t=arr[idx];
                arr[idx]=arr[i];
                arr[i]=t;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}