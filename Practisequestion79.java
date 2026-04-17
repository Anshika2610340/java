import java.util.Scanner;
public class Practisequestion79 {
    public static void main(String[] args) {
        /*Write a program to accept the year of graduation from school as an integer value from the user. Using the binary search technique on the sorted array of integers given below, output the message "Record exists" if the value input is located in the array. If not, output the message "Record does not exist". */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the year to be searched");
        int key=sc.nextInt();
        //sorting the array
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        int beg = 0;
        int end = n - 1;
        boolean found = false;

        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            }
            else if (key < arr[mid]) {
                end = mid - 1;   
            } 
            else {
                beg = mid + 1;   
            }
        }

        if (found) {
            System.out.println("Record exists");
        } 
        else {
            System.out.println("Record does not exist");
        }
        sc.close();
    }
}