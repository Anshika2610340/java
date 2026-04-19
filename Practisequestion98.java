import java.util.Scanner;
public class Practisequestion98 {
    public static void main(String[] args) {
        /*Define a class to initialize the following data in an array.
        Search for a given character input by the user, using the Binary Search technique.
        Print “Search successful” if the character is found otherwise print “Search is not successful”.
        ‘A’, ‘H’, ‘N’, ‘P’, ‘S’, ‘U’, ‘W’, ‘Y’, ‘Z’, ‘b’, ‘d’ */
        Scanner sc=new Scanner(System.in);
        char arr[]={'A','H','N','P','S','U','W','Y','Z','b','d'};
        int len=arr.length;
        int high=len-1;
        int low=0;
        int mid=0;
        System.out.println("enter key:");
        char key=sc.nextLine().charAt(0);
        boolean ch=false;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("search successful");
                ch=true;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(ch==false){
            System.out.println("search unsuccessful");
        }
        sc.close();
    }
}