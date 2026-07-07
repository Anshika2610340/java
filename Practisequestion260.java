import java.util.ArrayList;
import java.util.List;

public class Practisequestion260 {
    /*Write a Java program to create a generic method that takes a list of any type and
    returns it as a new list with the elements in reverse order.*/
    public static <T> List<T> reverse(List<T> original) {
        ArrayList<T> reversed = new ArrayList<T>();
        for (int a = original.size() - 1; a >= 0; a--) {
            reversed.add(original.get(a));
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> arraylist = List.of(1, 2, 3, 4, 5);
        List<Integer> reversed = reverse(arraylist);
        System.out.println(reversed);
    }
}

