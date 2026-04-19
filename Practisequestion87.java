import java.util.Scanner;
public class Practisequestion87 {
    public static void main(String[] args) {
        /*Define a class to declare a character array of size ten. Accept the characters into the array and display the characters with highest and lowest ASCII (American Standard Code for Information Interchange) value.
        EXAMPLE :
        INPUT:
        'R', 'z', 'q', 'A', 'N', 'p', 'm', 'U', 'Q', 'F'
        OUTPUT :
        Character with highest ASCII value = z
        Character with lowest ASCII value = A */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        char arr[]=new char[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        int max=0,min=(int)arr[0];
        for(int i=0;i<n;i++){
            if((int)arr[i]>max){
                max=(int)arr[i];
            }
            else if((int)arr[i]<min){
                min=(int)arr[i];
            }
        }
        System.out.println("character with highest ascii value:"+(char)max);
        System.out.println("character with lowest ascii value:"+(char)min);
        sc.close();
    }
}