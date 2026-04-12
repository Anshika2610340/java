import java.util.Scanner;
public class Practisequestion35 {
    public static void main(String[] args) {
        /*Given below is a hypothetical table showing rates of income tax for male citizens below the age of 65 years:

        Taxable income (TI) in ₹	Income Tax in ₹
        Does not exceed Rs. 1,60,000	Nil
        Is greater than Rs. 1,60,000 and less than or equal to Rs. 5,00,000.	(TI - 1,60,000) x 10%
        Is greater than Rs. 5,00,000 and less than or equal to Rs. 8,00,000	[(TI - 5,00,000) x 20%] + 34,000
        Is greater than Rs. 8,00,000	[(TI - 8,00,000) x 30%] + 94,000
        Write a program to input the age, gender (male or female) and Taxable Income of a person.

        If the age is more than 65 years or the gender is female, display “wrong category”. 
        If the age is less than or equal to 65 years and the gender is male, compute and display the income tax payable as per the table given above. */
        Scanner sc=new Scanner(System.in);
        int age,ti;
        double it=0.0;
        String gender;
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("enter gender");
        gender=sc.next();
        System.out.println("enter taxable amount");
        ti=sc.nextInt();
        if(age>65 || gender.equalsIgnoreCase("female")){
            System.out.println("wrong category");
        }
        else{
             if(ti<=160000){
                it=0.0;
            }
            else if(ti>160000 && ti<=500000){
                it=(ti - 160000)*(double)10/100;
            }
            else if(ti>500000 && ti<=800000){
                it=((ti - 500000) * (double)20/100) + 34000;
            }
            else{
                it=((ti - 800000) * (double)30/100) + 94000;
            }
            System.out.println("income tax is: "+it);
        }
        sc.close();
    }
}