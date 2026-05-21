import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class duplicate extends Exception{
    @Override
    public String toString() {
        return "duplicate elements found";
    }

    @Override
    public String getMessage() {
        return "duplicate elements found";
    }
}
public class Practisequestion195 {
    public static void main(String[] args) {
        /*Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.*/
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements of array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (arr[i] == arr[j]) {
                        throw new duplicate();
                    }
                }
            }
            System.out.println("no duplicate elements found!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
