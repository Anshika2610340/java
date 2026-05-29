import java.util.*;
public class Practisequestion219 {
    public static void main(String[] args) {
        /*Write a Java program to iterate through all elements in a linked list starting at the specified position.*/
        LinkedList<String> l1=new LinkedList<>();
        l1.add("anurag");
        l1.add("anandita");
        l1.add("alankrita");
        l1.add("ruhani");
        l1.add("rupal");
        Iterator p=l1.listIterator(2);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
