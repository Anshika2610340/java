import java.util.Scanner;
class mobike{
    int bno,phno,days,charges;
    String name;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bike number:");
        bno=sc.nextInt();
        System.out.println("enter phone number:");
        phno=sc.nextInt();
        System.out.println("enter days:");
        days=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name:");
        name=sc.nextLine();
        sc.close();
    }
    public void compute(){
        if(days<=5){
            charges=days*500;
        }
        else if(days>5 && days<=10){
            charges=5*500+(days-5)*400;
        }
        else{
            charges=5*500+5*400+(days-10)*200;
        }
    }
    public void display(){
        System.out.println("bike no.\tphone no.\tname\tno. of days\tcharges");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charges);
    }
}
public class Practisequestion134 {
    public static void main(String[] args) {
        /*Define a class called 'Mobike' with the following specifications:
        Data Members	Purpose
        int bno	To store the bike number
        int phno	To store the phone number of the customer
        String name	To store the name of the customer
        int days	To store the number of days the bike is taken on rent
        int charge	To calculate and store the rental charge
        Member Methods	Purpose
        void input()	To input and store the details of the customer
        void compute()	To compute the rental charge
        void display()	To display the details in the given format
        The rent for a mobike is charged on the following basis:
        Days	Charge
        For first five days	₹500 per day
        For next five days	₹400 per day
        Rest of the days	₹200 per day
        Output:
        Bike No.    Phone No.   Name    No. of days     Charge
        xxxxxxx     xxxxxxxx    xxxx        xxx         xxxxxx        */
        mobike m=new mobike();
        m.input();
        m.compute();
        m.display();
    }
}
