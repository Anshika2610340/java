class odd extends Exception{
    @Override
    public String toString() {
        return "no. should not be odd";
    }

    @Override
    public String getMessage() {
        return "no. should not be odd";
    }
}
public class Practisequestion194 {
    public static void number(int a) throws odd {
        if (a % 2 != 0) {
            throw new odd();
        }
        System.out.println("number is even");
    }

    public static void main(String[] args) {
        /*Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd*/
        int a = 5;
        try {
            number(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}