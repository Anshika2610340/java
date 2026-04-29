import java.util.Scanner;
class showroom{
    String name;
    long mobno;
    double cost,dis,amount;
    showroom(){
        name="";
        mobno=0;
        cost=0;
        dis=0;
        amount=0;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customers name:");
        name=sc.nextLine();
        System.out.println("enter mobno:");
        mobno=sc.nextLong();
        System.out.println("enter cost:");
        cost=sc.nextDouble();
        sc.close();
    }
    public void calculate(){
        if(cost<=10000){
            dis=5;
        }
        else if(cost<=20000){
            dis=10;
        }
        else if(cost<=35000){
            dis=15;
        }
        else{
            dis=20;
        }
        amount=cost-(cost*dis/100);
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("mobno:"+mobno);
        System.out.println("amount after discount:"+amount);
    }
}
public class Practisequestion126 {
    public static void main(String[] args) {
        /*Design a class name ShowRoom with the following description:
        Instance variables / Data members:
        String name — To store the name of the customer
        long mobno — To store the mobile number of the customer
        double cost — To store the cost of the items purchased
        double dis — To store the discount amount
        double amount — To store the amount to be paid after discount
        Member methods:
        ShowRoom() — default constructor to initialize data members
        void input() — To input customer name, mobile number, cost
        void calculate() — To calculate discount on the cost of purchased items, based on following criteria
        Cost	Discount (in percentage)
        Less than or equal to ₹10000	5%
        More than ₹10000 and less than or equal to ₹20000	10%
        More than ₹20000 and less than or equal to ₹35000	15%
        More than ₹35000	20%
        void display() — To display customer name, mobile number, amount to be paid after discount.
        Write a main method to create an object of the class and call the above member methods.*/
        showroom sh=new showroom();
        sh.input();
        sh.calculate();
        sh.display();
    }
}