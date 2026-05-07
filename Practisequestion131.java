import java.util.Scanner;
class moviemagic{
    int year;
    String title;
    float rating;
    moviemagic(){
        year=0;
        title="";
        rating=0.0f;
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        year=sc.nextInt();
        sc.nextLine();
        System.out.println("enter title:");
        title=sc.nextLine();
        System.out.println("enter rating:");
        rating=sc.nextFloat();
        sc.close();
    }
    public void display(){
        System.out.println("title:"+title);
        if(rating>0.0 && rating<=2.0){
            System.out.println("flop");
        }
        else if(rating>2.1 && rating<=3.4){
            System.out.println("semi-hit");
        }
        else if(rating>3.5 && rating<=4.4){
            System.out.println("hit");
        }
        else if(rating>4.5 && rating<=5.0){
            System.out.println("super-hit");
        }
    }
}
public class Practisequestion131 {
    public static void main(String[] args) {
        /*Define a class named movieMagic with the following description:
        Data Members	Purpose
        int year	To store the year of release of a movie
        String title	To store the title of the movie
        float rating	To store the popularity rating of the movie
        (minimum rating=0.0 and maximum rating=5.0)
        Member Methods	Purpose
        movieMagic()	Default constructor to initialize numeric data members to 0 and String data member to "".
        void accept()	To input and store year, title and rating
        void display()	To display the title of the movie and a message based on the rating as per the table given below
        Ratings Table
        Rating	Message to be displayed
        0.0 to 2.0	Flop
        2.1 to 3.4	Semi-Hit
        3.5 to 4.4	Hit
        4.5 to 5.0	Super-Hit
        Write a main method to create an object of the class and call the above member methods. */
        moviemagic m=new moviemagic();
        m.accept();
        m.display();
    }
}
