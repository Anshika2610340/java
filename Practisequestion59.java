import java.util.Scanner;
public class Practisequestion59 {
    public static void main(String[] args) {
        /*Define a class to accept a string and convert it into uppercase. Count and display the number of vowels in it.
        Input: robotics
        Output: ROBOTICS
        Number of vowels: 3 */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int len=s.length();
        int vowel=0;
        for (int i=0;i<len;i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                vowel++;
            }
        }
        System.out.println("vowels in the given string is:"+vowel);
        sc.close();
    }
}