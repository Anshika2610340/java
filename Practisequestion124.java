import java.util.Scanner;
class Eshop{
    String name;
    double price;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the item purchased:");
        name=sc.nextLine();
        System.out.println("enter the price of the item:");
        price=sc.nextDouble();
        sc.close();
    }
    public void calculate(){
        if(price>=1000 && price<=25000){
            price-=price*0.05;
        }
        else if(price>25000 && price<=57000){
            price-=price*0.075;
        }
        else if(price>57000 && price<=100000){
            price-=price*0.10;
        }
        else{
            price-=price*0.15;
        }
    }
    public void display(){
        System.out.println("item\tnet amount");
        System.out.println(name+"\t"+price);
    }
}
public class Practisequestion124 {
    public static void main(String[] args) {
        /*Define a class called with the following specifications:
        Class name: Eshop
        Member variables:
        String name: name of the item purchased
        double price: Price of the item purchased
        Member methods:
        void accept(): Accept the name and the price of the item using the methods of Scanner class.
        void calculate(): To calculate the net amount to be paid by a customer, based on the following criteria:
        Price	Discount
        1000 – 25000	5.0%
        25001 – 57000	7.5 %
        57001 – 100000	10.0%
        More than 100000	15.0 %
        void display(): To display the name of the item and the net amount to be paid.
        Write the main method to create an object and call the above methods. */
        Eshop e=new Eshop();
        e.accept();
        e.calculate();
        e.display();
    }
}
