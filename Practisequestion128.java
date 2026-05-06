import java.util.Scanner;
class electricbill{
    String n;
    int units;
    double bill;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customers name:");
        n=sc.nextLine();
        System.out.println("enter units consumed:");
        units=sc.nextInt();
        sc.close();
    }
    public void calculate(){
        if(units<=100){
            bill=units*2.00;
        }
        else if(units<=300){
            bill=100*2.00+(units-100)*3.00;
        }
        else{
            bill=100*2.00+200*3.00+(units-300)*5.00;
            bill=bill+(bill*2.5)/100.0;
        }
    }
    public void print(){
        System.out.println("name of customers:"+n);
        System.out.println("number of units consumed:"+units);
        System.out.println("bill amount:"+bill);
    }
}
public class Practisequestion128 {
    public static void main(String[] args) {
        /*Define a class ElectricBill with the following specifications:
        class : ElectricBill
        Instance variables / data member:
        String n — to store the name of the customer
        int units — to store the number of units consumed
        double bill — to store the amount to be paid
        Member methods:
        void accept( ) — to accept the name of the customer and number of units consumed
        void calculate( ) — to calculate the bill as per the following tariff:
        Number of units	Rate per unit
        First 100 units	Rs.2.00
        Next 200 units	Rs.3.00
        Above 300 units	Rs.5.00
        A surcharge of 2.5% charged if the number of units consumed is above 300 units.
        void print( ) — To print the details as follows:
        Name of the customer: ………………………
        Number of units consumed: ………………………
        Bill amount: ………………………
        Write a main method to create an object of the class and call the above member methods. */
        electricbill eb=new electricbill();
        eb.accept();
        eb.calculate();
        eb.print();
    }
}
