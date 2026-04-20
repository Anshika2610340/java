import java .util.Scanner;
public class Practisequestion101 {
    public static void main(String[] args) {
        /*Shasha Travels Pvt. Ltd. gives the following discount to its customers:
        Ticket Amount	Discount
        Above Rs. 70000	18%
        Rs. 55001 to Rs. 70000	16%
        Rs. 35001 to Rs. 55000	12%
        Rs. 25001 to Rs. 35000	10%
        Less than Rs. 25001	2%
        Write a program to input the name and ticket amount for the customer and calculate the discount amount and net amount to be paid. Display the output in the following format for each customer:
        Sl. No.     Name    Ticket Charges     Discount      Net Amount
        (Assume that there are 15 customers, first customer is given the serial no (SI. No.) 1, next customer 2 …….. and so on)*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        String names[]=new String[n];
        int amount[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the names:");
            names[i]=sc.next();
            System.out.println("enter amount:");
            amount[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<n;i++){
            if(amount[i]>70000){
                d=18;
            }
            else if(amount[i]>55000 && amount[i]<=70000){
                d=16;
            }
            else if(amount[i]>35000 && amount[i]<=55000){
                d=12;
            }
            else if(amount[i]>25000 && amount[i]<=35000){
                d=10;
            }
            else{
                d=2;
            }
            int da=amount[i]*d/100;
            int netamount=amount[i]-da;
            System.out.println((i+1)+"\t"+names[i]+"\t"+amount[i]+"\t"+da+"\t"+netamount);
        }
        sc.close();
    }
}