import java.util.Scanner;
public class Practisequestion30 {
    public static void main(String[] args) {
        /*Write a Java program to find the number of days in a month. */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month number");
        int month=sc.nextInt();
        if (month<1 || month>12){
            System.out.println("invalid choice");
        }
        int year;
        System.out.println("enter year");
        year=sc.nextInt();
        int no_of_month_days=0;
        String monthname="";
        switch (month) {
            case 1:
                monthname="january";
                no_of_month_days=31;
                break;
            case 2:
                monthname="febrary";
                if((year%4==0 && year%100!=0) || year%400==0){
                    no_of_month_days=29;
                }
                else{
                    no_of_month_days=28;
                }
                break;
            case 3:
                monthname="march";
                no_of_month_days=31;
                break;
            case 4:
                monthname="april";
                no_of_month_days=30;
                break;
            case 5:
                monthname="may";
                no_of_month_days=31;
                break;
            case 6:
                monthname="june";
                no_of_month_days=30;
                break;
            case 7:
                monthname="july";
                no_of_month_days=31;
                break;
            case 8:
                monthname="august";
                no_of_month_days=31;
                break;
            case 9:
                monthname="september";
                no_of_month_days=30;
                break;
            case 10:
                monthname="october";
                no_of_month_days=31;
                break;
            case 11:
                monthname="november";
                no_of_month_days=30;
                break;
            case 12:
                monthname="december";
                no_of_month_days=31;
                break;
        }
        System.out.println(monthname+" "+year+" has "+no_of_month_days+" days");
        sc.close();
    }
}