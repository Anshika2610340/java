import java.util.*;
public class Practisequestion212 {
    public static void main(String[] args) {
        /*Write a Java program to test whether an array list is empty or not*/
        ArrayList<String> color1=new ArrayList<>();
        color1.add("green");
        color1.add("pink");
        color1.add("yellow");
        color1.add("black");
        System.out.println("checking whether color1 is empty or not!");
        System.out.println(color1.isEmpty());
        ArrayList<String> color2=new ArrayList<>();
        System.out.println("checking color2 is empty or not!");
        System.out.println(color2.isEmpty());
    }
}
