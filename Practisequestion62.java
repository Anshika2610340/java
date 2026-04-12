import java.util.Scanner;
public class Practisequestion62 {
    public static void main(String[] args) {
        /*Define a class to accept the gmail id and check for its validity.
        A gmail id is valid only if it has:
        → @
        → .(dot)
        → gmail
        → com */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a gmail");
        String gmail=sc.nextLine();
        if(gmail.endsWith("@gmail.com")){
            System.out.println("valid gmail");
        }
        else{
            System.out.println("not a valid gmail");
        }
        sc.close();
    }
}