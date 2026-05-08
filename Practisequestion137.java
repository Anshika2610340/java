class book{
    String title,author;
    double price;
    public book(){
        title="unknown";
        author="unknown";
        price=0.0;
    }
    public book(String t,String a){
        title=t;
        author=a;
        price=0.0;
    }
    public book(String t1,String a1,double p){
        author=a1;
        title=t1;
        price=p;
    }
}
public class Practisequestion137 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
        One constructor takes title and author as parameters.
        The other constructor takes title, author, and price as parameters.
        Print the values of the variables for each constructor. */
        book b1=new book();
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        book b2=new book("amatka","karin techbeck");
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        book b3=new book("altered carbon","richard k.morgan",18.99);
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);
    }
}