import java.util.Scanner;
public class Practisequestion89 {
    public static void main(String[] args) {
        /*Define a class to declare an array to accept and store ten words. Display only those words which begin with the letter 'A' or 'a' and also end with the letter 'A' or 'a'.
        EXAMPLE :
        Input : Hari, Anita, Akash, Amrita, Alina, Devi Rishab, John, Farha, AMITHA
        Output: Anita
        Amrita
        Alina
        AMITHA */
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        System.out.println("enter elements in array");
        for(int i=0;i<10;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<10;i++){
            String s=arr[i].toUpperCase();
            int len=s.length();
            char beg=s.charAt(0);
            char end=s.charAt(len-1);
            if(beg=='A' && end=='A'){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}