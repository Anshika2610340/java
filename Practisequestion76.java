import java.util.Scanner;

public class Practisequestion76 {
    public static void main(String[] args) {
        /*Write a program to accept the names of 10 cities in a single dimensional string array and their STD (Subscribers Trunk Dialling) codes in another single dimension integer array. Search for the name of a city input by the user in the list. If found, display "Search Successful" and print the name of the city along with its STD code, or else display the message "Search unsuccessful, no such city in the list". */
        Scanner sc=new Scanner(System.in);
        String s[]=new String[10];
        String id[]=new String[10];
        int t=0;
        System.out.println("enter 10 cities and their id");
        for(int i=0;i<10;i++){
            System.out.println("enter cities");
            s[i]=sc.next();
            System.out.println("enter std codes");
            id[i]=sc.next();
        }
        System.out.println("enter the name of the city to be searched");
        String city=sc.next();
        for(int i=0;i<10;i++){
            if(city.compareToIgnoreCase(s[i])==0){
                System.out.println("search successful");
                System.out.println("city name:"+city+"\tstd code:"+id[i]);
                t=1;
                break;
            }
        }
        if(t==0){
            System.out.println("search unsuccessful");
        }
        sc.close();
    }
}