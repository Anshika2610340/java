import java.util.Scanner;
public class Practisequestion50 {
    public static void main(String[] args) {
        /*Write a program to input a number and check and print whether it is a Pronic number or not. (Pronic number is the number which is the product of two consecutive integers)
        Examples:
        12 = 3 x 4
        20 = 4 x 5
        42 = 6 x 7 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=1;i<=num;i++){
            if(num==(i*(i+1))){
                System.out.println("pronic number");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("not a pronic number");
        }
        sc.close();
    }
}