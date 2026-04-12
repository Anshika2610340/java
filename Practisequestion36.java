import java.util.Scanner;
public class Practisequestion36 {
    public static void main(String[] args) {
        /*Write a program to accept a string. Convert the string into upper case letters. Count and output the number of double letter sequences that exist in the string.
        Sample Input: "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE"
        Sample Output: 4 */
        Scanner sc=new Scanner(System.in);
        String str1,s;
        System.out.println("enter the string");
        str1=sc.nextLine();
        s=str1.toUpperCase();
        int len;
        len=s.length();
        int i,count=0;
        for(i=0;i<len-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}