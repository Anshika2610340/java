import java.util.Scanner;
public class Practisequestion94 {
    public static void main(String[] args) {
        /*Define a class to accept values into a 3 × 3 array and check if it is a special array. An array is a special array if the sum of the even elements = sum of the odd elements.
        Example:
        A[ ][ ]={{ 4 ,5, 6}, { 5 ,3, 2}, { 4, 2, 5}};
        Sum of even elements = 4 + 6 + 2 + 4 + 2 = 18
        Sum of odd elements = 5 + 5 + 3 + 5 = 18 */
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("enter elements into the array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sumeven=0,sumodd=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    sumeven+=arr[i][j];
                }
                else{
                    sumodd+=arr[i][j];
                }
            }
        }
        if(sumeven==sumodd){
            System.out.println("special array");
        }
        else{
            System.out.println("not a special array");
        }
        sc.close();
    }
}