import java.util.Scanner;
public class Checkinteger {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}

