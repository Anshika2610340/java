import java.util.*;
public class Practisequestion248 {
    public static void main(String[] args) {
        /*Write a Java program to clone a hash set to another hash set.*/
        HashSet<Integer> hash=new HashSet<>();
        hash.add(56);
        hash.add(78);
        HashSet<Integer> cl = new HashSet<>();
        cl=(HashSet)hash.clone();
        System.out.println("original list:"+hash);
        System.out.println("cloned list:"+cl);
    }
}
