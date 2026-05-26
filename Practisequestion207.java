import java.util.*;
public class Practisequestion207 {
    public static void main(String[] args) {
        /*Write a Java program to compare two array lists.*/
        ArrayList<String> color1=new ArrayList<>();
        color1.add("red");
        color1.add("green");
        color1.add("white");
        color1.add("blue");
        color1.add("pink");
        ArrayList<String> color2=new ArrayList<>();
        color2.add("pink");
        color2.add("white");
        color2.add("orchard");
        ArrayList<String> compare=new ArrayList<>();
        for(String e:color1){
            compare.add(color2.contains(e)?"yes":"no");
        }
        for(int i=0;i<compare.size();i++){
            System.out.println(compare.get(i));
        }
    }
}
