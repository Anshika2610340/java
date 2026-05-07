import java.util.Scanner;
class fruitjuice{
    int product_code,pack_size,product_price;
    String flavour,pack_type;
    fruitjuice(){
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product code:");
        product_code=sc.nextInt();
        System.out.println("enter pack size:");
        pack_size=sc.nextInt();
        System.out.println("enter product_price:");
        product_price=sc.nextInt();
        sc.nextLine();
        System.out.println("enter flavour:");
        flavour=sc.nextLine();
        System.out.println("enter pack type:");
        pack_type=sc.nextLine();
        sc.close();
    }
    public void discount(){
        product_price-=10;
    }
    public void display(){
        System.out.println("product code:"+product_code);
        System.out.println("flavour:"+flavour);
        System.out.println("pack type:"+pack_type);
        System.out.println("pack size:"+pack_size);
        System.out.println("product price:"+product_price);
    }
}
public class Practisequestion132 {
    public static void main(String[] args) {
        /*Define a class named FruitJuice with the following description:
        Data Members	Purpose
        int product_code	stores the product code number
        String flavour	stores the flavour of the juice (e.g., orange, apple, etc.)
        String pack_type	stores the type of packaging (e.g., tera-pack, PET bottle, etc.)
        int pack_size	stores package size (e.g., 200 mL, 400 mL, etc.)
        int product_price	stores the price of the product
        Member Methods	Purpose
        FruitJuice()	constructor to initialize integer data members to 0 and string data members to ""
        void input()	to input and store the product code, flavour, pack type, pack size and product price
        void discount()	to reduce the product price by 10
        void display()	to display the product code, flavour, pack type, pack size and product price */
        fruitjuice f=new fruitjuice();
        f.input();
        f.discount();
        f.display();
    }
}
