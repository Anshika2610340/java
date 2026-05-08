class bankaccount2{
    double accountnumber;
    double balance;
    public bankaccount2(double accountnumber,double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposited:"+amount);
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("withdrawn:"+amount);
    }
    public double getbalance(){
        return balance;
    }
}
class savingaccount2 extends bankaccount2{
    public savingaccount2(double accountnumber,double balance){
        super(accountnumber,balance);
    }
    public void withdraw(double amount){
        if((balance-amount)<100){
            System.out.println("minimum balance must be rup.100");
        }
        else{
            balance-=amount;
            System.out.println("withdrawn:"+amount);
        }
    }
}
public class Practisequestion147 {
    public static void main(String[] args) {
        /* Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
        Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred. */
        savingaccount2 sa=new savingaccount2(123456,500);
        sa.deposit(23.90);
        sa.withdraw(450.89);
        System.out.println(sa.getbalance());
    }
}
