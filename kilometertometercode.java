import java.util.Scanner;
public class kilometertometercode {
    public static void main(String[] args) {
        System.out.println("enter the value in kilometer:");
        Scanner sc = new Scanner(System.in);
        float kilometer = sc.nextFloat();
        float meter=kilometer*1000;
        System.out.println("the value of distance in meter:"+ meter);
        sc.close();
    }
}