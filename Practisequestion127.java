import java.util.Scanner;
class railwayticket{
    String name,coach;
    long mobno;
    int amt,totalamt;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter coach:");
        coach=sc.nextLine();
        System.out.println("enter mobno:");
        mobno=sc.nextLong();
        System.out.println("enter amount:");
        amt=sc.nextInt();
        sc.close();
    }
    public void update(){
        if(coach.equalsIgnoreCase("First_Ac")){
            totalamt=amt+700;
        }
        else if(coach.equalsIgnoreCase("Second_Ac")){
            totalamt=amt+500;
        }
        else if(coach.equalsIgnoreCase("Third_Ac")){
            totalamt=amt+250;
        }
        else{
            totalamt=amt;
        }
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("coach:"+coach);
        System.out.println("total amount:"+totalamt);
        System.out.println("mobile number:"+mobno);
    }
}
public class Practisequestion127 {
    public static void main(String[] args) {
        /*Design a class RailwayTicket with following description:
        Instance variables/data members:
        String name — To store the name of the customer
        String coach — To store the type of coach customer wants to travel
        long mobno — To store customer’s mobile number
        int amt — To store basic amount of ticket
        int totalamt — To store the amount to be paid after updating the original amount
        Member methods:
        void accept() — To take input for name, coach, mobile number and amount.
        void update() — To update the amount as per the coach selected (extra amount to be added in the amount as follows)
        Type of Coaches	Amount
        First_AC	700
        Second_AC	500
        Third_AC	250
        sleeper	None
        void display() — To display all details of a customer such as name, coach, total amount and mobile number.
        Write a main method to create an object of the class and call the above member methods. */
        railwayticket rt=new railwayticket();
        rt.accept();
        rt.update();
        rt.display();
    }
}