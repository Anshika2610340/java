interface factorial{
    int fact(long a);
}
public class Practisequestion259 {
    public static void main(String[] args) {
        /*Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.*/
        factorial obj = (a) -> {
            int result = 1;
            for (long i = a; i >= 1; i--) {
                result *= i;
            }
            return result;
        };
        System.out.println(obj.fact(3));
    }
}