import java.util.Scanner;
public class Practisequestion42 {
    public static void main(String[] args) {
        /*Using the switch statement, write a menu driven program to calculate the maturity amount of a Bank Deposit.
        The user is given the following options:
        Term Deposit
        Recurring Deposit
        For option 1, accept principal (P), rate of interest(r) and time period in years(n). Calculate and output the maturity amount(A) receivable using the formula:
        A = P[1 + r / 100]n
        For option 2, accept Monthly Installment (P), rate of interest (r) and time period in months (n). Calculate and output the maturity amount (A) receivable using the formula:
        A = P x n + P x (n(n+1) / 2) x r / 100 x 1 / 12
        For an incorrect option, an appropriate error message should be displayed. */
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1 for term deposit");
        System.out.println("enter 2 for recurring deposit");
        System.out.println();
        int ch;
        System.out.println("enter choice");
        ch=input.nextInt();
        switch(ch){
            case 1:
                System.out.println("enter principal,rate of interest,time period");
                double n,p,r;
                p=input.nextDouble();
                r=input.nextDouble();
                n=input.nextDouble();
                double a=Math.pow(p*((1+r)/100), n);
                System.out.println("maturity amount:"+a);
                break;
            case 2:
                System.out.println("enter principal,rate of interest,time period");
                double n1,p1,r1;
                p1=input.nextDouble();
                r1=input.nextDouble();
                n1=input.nextDouble();
                double a1=p1*n1+p1*(n1*(n1+1)/2)*r1/100*1/12;
                System.out.println("maturity amount:"+a1);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
        input.close();
    }
}