import java.util.Scanner;
class account2{
    String accountnumber;
    double balance;
    public account2(String accnum,double bal){
        if(accnum==null || accnum.isEmpty()){
            System.out.println("error: account number cannot be blank");
        }
        if(bal<0){
            System.out.println("error: balance cannot be negative");
        }
        accountnumber=accnum;
        balance=bal;
    }
}
public class Practisequestion140 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
        accountNumber should be non-null and non-empty.
        balance should be non-negative.
        Print an error message if the validation fails. */
        Scanner sc=new Scanner(System.in);
        double bal;
        String accnum;
        System.out.println("enter account number:");
        accnum=sc.next();
        System.out.println("enter balance in the account:");
        bal=sc.nextDouble();
        account2 a1=new account2(accnum,bal);
        System.out.println(a1.accountnumber);
        System.out.println(a1.balance);
        account2 a2=new account2("",1000);
        account2 a3=new account2("12345",-600);
        sc.close();
    }
}