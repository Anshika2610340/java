import java.util.Scanner;
class bank{
    double p,n,r,a;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of principal amount:");
        p=sc.nextDouble();
        System.out.println("enter the value of time period in years:");
        n=sc.nextDouble();
        sc.close();
    }
    public void calculate(){
        if(n<=0.5){
            r=9;
        }
        else if(n>0.5 && n<=1){
            r=10;
        }
        else if(n>1 && n<=3){
            r=11;
        }
        else{
            r=12;
        }
        a=p*Math.pow(1+(r/100),n);
    }
    public void display(){
        System.out.println("principle\ttime\trate\tamount");
        System.out.println(p+"\t"+n+"\t"+r+"\t"+a);
    }
}
public class Practisequestion122 {
    public static void main(String[] args) {
        /*Define a class with the following specifications:
        Class name: Bank
        Member variables:
        double p — stores the principal amount
        double n — stores the time period in years
        double r — stores the rate of interest
        double a — stores the amount
        Member methods:
        void accept () — input values for p and n using Scanner class methods only.
        void calculate () — calculate the amount based on the following conditions:
        Time in (Years)	Rate %
        Upto 1⁄2	9
        > 1⁄2 to 1 year	10
        > 1 to 3 years	11
        > 3 years	12
        a=p(1+r/100)^n
        void display () — display the details in the given format.
        Principal	Time	Rate	Amount
        XXX	        XXX	    XXX	    XXX
        Write the main method to create an object and call the above methods. */
        bank b=new bank();
        b.accept();
        b.calculate();
        b.display();
    }
}