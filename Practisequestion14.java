public class Practisequestion14{
    public static void main(String[] args) {
        /*Write a Java program to compare two strings lexicographically.
        Two strings are lexicographically equal if they are the same length and 
        contain the same characters in the same positions. */
        String str1="hello";
        String str2="hello1";
        int result=str1.compareTo(str2);
        if (result==0){
            System.out.println("the strings are lexicographically equal");
        }
        else if(result<0){
            System.out.println(str1+" is less than "+str2);
        }
        else{
            System.out.println(str1+" is greater than "+str2);
        }
    }
}