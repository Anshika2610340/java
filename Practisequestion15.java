public class Practisequestion15 {
    public static void main(String[] args) {
        /*Write a Java program to compare two strings lexicographically, ignoring case differences. */
        String str1="hello";
        String str2="HELLO";
        int result=str1.compareToIgnoreCase(str2);
        if (result==0){
            System.out.println("the strings are lexically equal");
        }
        else if (result<0){
            System.out.println(str1+"the string is less than"+str2);
        }
        else{
            System.out.println(str1+"the string is greater than"+str2);
        }
    }
}