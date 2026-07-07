interface str{
    String strempty(String str1);
}
public class Practisequestion258 {
    public static void main(String[] args) {
        /*Write a Java program to implement a lambda expression to check if a given string is empty.*/
        str st=(str1)-> {
            return String.valueOf(str1.isEmpty());
        };
        String str2=st.strempty("");
        System.out.println(str2);
    }
}
