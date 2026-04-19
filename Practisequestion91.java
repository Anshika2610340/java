import java.util.Scanner;
public class Practisequestion91 {
    public static void main(String[] args) {
        /*Define a class to accept values into an array of double data type of size 20. Accept a double value from user and search in the array using linear search method. If value is found display message "Found" with its position where it is present in the array. Otherwise display message "not found". */
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        double arr[]=new double[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        boolean ch=false;
        int pos=0;
        System.out.println("enter key to be searched:");
        double key=sc.nextDouble();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                ch=true;
                pos=i;
                break;
            }
        }
        if(ch==true){
            System.out.println("found with position:"+pos);
        }
        else{
            System.out.println("not found");
        }
        sc.close();
    }
}