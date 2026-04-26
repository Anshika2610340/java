interface account{
    public void deposit(double amount);
    public void withdraw(double amount);
    public double calculateinterest();
    public double viewbalance();
}
class bankaccount1 implements account{
    double balance,interest;
    bankaccount1(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double calculateinterest(){
        return interest;
    }
    public double viewbalance(){
        return balance;
    }
}
class savingaccount1 implements account{
    double balance,interest;
    savingaccount1(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double calculateinterest(){
        return interest;
    }
    public double viewbalance(){
        return balance;
    }
    public void safety(){
        System.out.println("saving account is safe");
    }
}
class currentaccount1 implements account{
    double balance,interest;
    currentaccount1(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double calculateinterest(){
        return interest;
    }
    public double viewbalance(){
        return balance;
    }
    public void current(){
        System.out.println("i am current account");
    }
}
public class Practisequestion167 {
    static void main() {
        /*Write a Java  programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount.
        The bank should have a list of accounts and methods for adding them.
        Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
        SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.*/
        bankaccount1 b=new bankaccount1(1200,600);
        b.deposit(200);
        b.withdraw(100);
        System.out.println(b.calculateinterest());
        System.out.println(b.viewbalance());
        savingaccount1 s=new savingaccount1(1300,600);
        s.deposit(200);
        s.withdraw(100);
        System.out.println(b.calculateinterest());
        System.out.println(b.viewbalance());
        s.safety();
        currentaccount1 c=new currentaccount1(1400,600);
        c.deposit(200);
        c.withdraw(100);
        System.out.println(b.calculateinterest());
        System.out.println(b.viewbalance());
        c.current();
    }
}
