import java.util.Scanner;
public class Practisequestion52 {
    public static void main(String[] args) {
        /*Write a menu driven program to display the pattern as per user’s choice.
        Pattern 1
        ABCDE
        ABCD
        ABC
        AB
        A
        Pattern 2
        B
        LL
        UUU
        EEEE
        For an incorrect option, an appropriate error message should be displayed. */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                for(int i=69;i>65;i--){
                    for (int j=65;j<=i;j++){
                        System.out.print((char)j);
                    }
                    System.out.println();
                }
                break;
            case 2:
                String s="BLUE";
                for(int i=0;i<s.length();i++){
                    for(int j=0;j<=i;j++){
                        System.out.print(s.charAt(i));
                    }
                    System.out.println();
                }
                break;
        
            default:
                System.out.println("invalid choice");
                break;
        }
        sc.close();
    }
}