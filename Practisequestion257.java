interface sumoftwonumbers{
    int sum(int a,int b);
}
public class Practisequestion257 {
    public static void main(String[] args) {
        /*Write a Java program to implement a lambda expression to find the sum of two integers.*/
        sumoftwonumbers som=(x,y)->x+y;
        int result=som.sum(4,8);
        System.out.println(result);
    }
}
