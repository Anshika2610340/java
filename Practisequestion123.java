import java.util.Scanner;
class courier{
    String name,address;
    double weight,bill;
    char type;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter weight:");
        weight=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter address:");
        address=sc.nextLine();
        System.out.println("enter type:");
        type=sc.next().charAt(0);
        sc.close();
    }
    public void calculate(){
        if(weight<=5){
            bill=weight*800;
        }
        else if(weight>5 && weight<=10){
            bill=5*800+(weight-5)*700;
        }
        else if(weight>10){
            bill=5*800+5*700+(weight-10)*500;
        }
        if(type=='i'|| type=='I'){
            bill+=1500;
        }
    }
    public void print(){
        System.out.println("name\tweight\taddress\ttype\tbill");
        System.out.println(name+"\t"+weight+"\t"+address+"\t"+type+"\t"+bill);
    }
}
public class Practisequestion123 {
    public static void main(String[] args) {
        /*DTDC a courier company charges for the courier based on the weight of the parcel. Define a class with the following specifications:
        Class name: courier
        Member variables:
        name – name of the customer
        weight – weight of the parcel in kilograms
        address – address of the recipient
        bill – amount to be paid
        type – 'D'- domestic, 'I'- international
        Member methods:
        void accept ( ) — to accept the details using the methods of the Scanner class only.
        void calculate ( ) — to calculate the bill as per the following criteria:
        Weight in Kgs	Rate per Kg
        First 5 Kgs	Rs.800
        Next 5 Kgs	Rs.700
        Above 10 Kgs	Rs.500
        An additional amount of Rs.1500 is charged if the type of the courier is I (International)
        void print ( ) — To print the details
        void main ( ) — to create an object of the class and invoke the methods */
        courier c=new courier();
        c.accept();
        c.calculate();
        c.print();
    }
}
