import java.util.Scanner;
class library{
    int accnum;
    String title,author;
    Scanner sc;

    public library(Scanner sc){
        this.sc = sc;
    }

    public void input(){
        System.out.println("enter accession number:");
        accnum=sc.nextInt();
        sc.nextLine();
        System.out.println("enter title:");
        title=sc.nextLine();
        System.out.println("enter author:");
        author=sc.nextLine();
    }
    public void compute(){
        System.out.println("enter late days:");
        int late=sc.nextInt();
        int fine=late*2;
        System.out.println("the fine is: " + fine);
    }
    public void display(){
        System.out.println("accession number\ttitle\tauthor");
        System.out.println(accnum+"\t"+title+"\t"+author);
    }
}
public class Practisequestion133{
    public static void main(String[] args) {
        /*Define a class called Library with the following description:
        Instance Variables/Data Members:
        int accNum — stores the accession number of the book.
        String title — stores the title of the book.
        String author — stores the name of the author.
        Member methods:
        void input() — To input and store the accession number, title and author.
        void compute() — To accept the number of days late, calculate and display the fine charged at the rate of Rs. 2 per day.
        void display() — To display the details in the following format:
        Accession Number    Title   Author
        Write a main method to create an object of the class and call the above member methods. */
        Scanner sc = new Scanner(System.in);
        library l=new library(sc);
        l.input();
        l.display();
        l.compute();
        sc.close();
    }
}