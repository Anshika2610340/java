abstract class bankaccount{
    double balance;
    public bankaccount(double balance){
        this.balance=balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class savingaccount extends bankaccount{
    public savingaccount(double balance){
        super(balance);
    }
    @Override
    void deposit(double amount){
        balance+=amount;
        System.out.println("deposited:"+amount);
    }
    @Override
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdrawn:"+amount);
        }
        else{
            System.out.println("insufficeint balance");
        }
    }
}
class currentaccount extends bankaccount{
    public currentaccount(double balance){
        super(balance);
    }
    @Override
    void deposit(double amount){
        balance+=amount;
        System.out.println("deposited:"+amount);
    }
    @Override
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdrawn:"+amount);
        }
        else{
            System.out.println("insufficeint balance");
        }
    }
}
public class Practisequestion154 {
    public static void main(String[] args) {
        /*Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
        Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type. */
        savingaccount s=new savingaccount(52000);
        currentaccount c=new currentaccount(52000);
        s.deposit(200);
        s.withdraw(500);
        c.deposit(200);
        c.withdraw(500);
    }
}
