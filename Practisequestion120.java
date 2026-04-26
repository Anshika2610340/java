import java.util.Scanner;
class hotel{
    String name;
    long mobno;
    int days,bill=0;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter the mobno:");
        mobno=sc.nextLong();
        System.out.println("enter days:");
        days=sc.nextInt();
        sc.close();
    }
    public void charge(){
        if(days<=3){
            bill=days*1000;
        }
        else if(days<=7){
            bill=(3*1000)+(days-3)*900;
        }
        else{
            bill=(3*1000)+(4*900)+(days-7)*800;
        }
        bill=bill+(int)(bill*0.18);
    }
    public void print(){
        System.out.println("customer's name:"+name);
        System.out.println("mobile number:"+mobno);
        System.out.println("bill:"+bill);
    }
}
public class Practisequestion120 {
    public static void main(String[] args) {
        /*Define a class with following specifications.
        class name: Hotel
        Member variables:
        String name – stores name of customer name
        long mobno – stores mobile number
        int days – stores number of days customer stayed in hotel
        int bill – stores customer bill
        Member method:
        void input() – input values using Scanner class methods only
        void charge() – calculate bill as per the following criteria
        days	charge/day
        first 3 days	1000 Rs/ day
        next 4 days	900 Rs/day
        > 7 days	800 Rs/day
        bill = bill + gst (18% of bill)
        void print() - Display customer name, mobile number and bill.
        Invoke all the above methods in main method with the help of an object. */
        hotel hotel=new hotel();
        hotel.input();
        hotel.charge();
        hotel.print();
    }
}