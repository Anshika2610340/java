import java.util.Scanner;
class bookfair{
    String bname;
    double price;
    public bookfair(){
        bname="";
        price=0.0d;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the book name:");
        bname=sc.nextLine();
        System.out.println("enter price:");
        price=sc.nextDouble();
        sc.close();
    }
    public void calculate(){
        if(price<=1000){
            price-=(price*2)/100.0;
        }
        else if(price<=3000){
            price-=(price*10)/100.0;
        }
        else{
            price-=(price*15)/100.0;
        }
    }
    public void display(){
        System.out.println("name of the book:"+bname);
        System.out.println("price after discount:"+price);
    }
}
public class Practisequestion129 {
    public static void main(String[] args) {
        /*Define a class named BookFair with the following description:
        Instance variables/Data members:
        String Bname — stores the name of the book
        double price — stores the price of the book
        Member methods:
        (i) BookFair() — Default constructor to initialize data members
        (ii) void Input() — To input and store the name and the price of the book.
        (iii) void calculate() — To calculate the price after discount. Discount is calculated based on the following criteria.
        Price	Discount
        Less than or equal to ₹1000	2% of price
        More than ₹1000 and less than or equal to ₹3000	10% of price
        More than ₹3000	15% of price
        (iv) void display() — To display the name and price of the book after discount.
        Write a main method to create an object of the class and call the above member methods. */
        bookfair b=new bookfair();
        b.input();
        b.calculate();
        b.display();
    }
}
