import java.util.Scanner;
public class Practisequestion86 {
    public static void main(String[] args) {
        /*Define a class to perform binary search on a list of integers given below, to search for an element input by the user, if it is found display the element along with its position, otherwise display the message "Search element not found".
        2, 5, 7, 10, 15, 20, 29, 30, 46, 50 */
        Scanner sc=new Scanner(System.in);
        int arr[]={2, 5, 7, 10, 15, 20, 29, 30, 46, 50};
        int n=arr.length;
        System.out.println("enter element to be searched");
        int key=sc.nextInt();
        int id=0;
        boolean flag=false;
        for (int i=0;i<n;i++){
            if(arr[i]==key){
                flag=true;
                id=i;
                break;
            }
        }
        if(flag==true){
            System.out.println("key found successfully");
            System.out.println("key:"+key+" index:"+id);
        }
        else{
            System.out.println("key does not exist");
        }
        sc.close();
    }
}