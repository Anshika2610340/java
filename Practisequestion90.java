import java.util.Scanner;
public class Practisequestion90 {
    public static void main(String[] args) {
        /*Define a class to accept 10 characters from a user. Using bubble sort technique arrange them in ascending order. Display the sorted array and original array. */
        Scanner sc=new Scanner(System.in);
        char arr[]=new char[10];
        System.out.println("enter elements into the array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextLine().charAt(0);
        }
        System.out.println("original array:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        //bubble sort technique
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                if((int)arr[j]>(int)arr[j+1]){
                    char temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}