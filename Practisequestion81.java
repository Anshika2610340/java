import java.util.Scanner;
public class Practisequestion81 {
    public static void main(String[] args) {
        /*Write a program to initialize the seven Wonders of the World along with their locations in two different arrays. Search for a name of the country input by the user. If found, display the name of the country along with its Wonder, otherwise display "Sorry not found!".
        Seven Wonders:
        CHICHEN ITZA, CHRIST THE REDEEMER, TAJ MAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA, COLOSSEUM
        Locations:
        MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY
        Examples:
        Country name: INDIA
        Output: TAJ MAHAL
        Country name: USA
        Output: Sorry Not found! */
        Scanner sc=new Scanner(System.in);
        String seven[]=new String[7];
        String country[]=new String[7];
        System.out.println("enter the names of 7 wonders");
        for(int i=0;i<7;i++){
            seven[i]=sc.nextLine();
        }
        System.out.println("enter the name of countries");
        for(int i=0;i<7;i++){
            country[i]=sc.nextLine();
        }
        boolean con=false;
        System.out.print("country name:");
        String t=sc.nextLine();
        for(int i=0;i<7;i++){
            if(t.compareToIgnoreCase(country[i])==0){
                System.out.println(seven[i]);
                con=true;
                break;
            }
        }
        if(con==false){
            System.out.println("sorry not found!");
        }
        sc.close();
    }
}