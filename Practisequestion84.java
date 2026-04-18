import java.util.Scanner;
public class Practisequestion84 {
    public static void main(String[] args) {
        /*Write a program to accept name and total marks of N number of students in two single subscript array name[] and totalmarks[].
        Calculate and print:
        The average of the total marks obtained by N number of students.
        [average = (sum of total marks of all the students)/N]
        Deviation of each student’s total marks with the average.
        [deviation = total marks of a student – average] */
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=sc.nextInt();
        String names[]=new String[n];
        int totalmarks[]=new int[n];
        System.out.println("enter elements in array");
        System.out.println("enter names of students");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        System.out.println("enter total marks");
        for(int i=0;i<n;i++){
            totalmarks[i]=sc.nextInt();
        }
        int avg=0,sum=0,dev=0;
        for(int i=0;i<n;i++){
            sum+=totalmarks[i];
        }
        avg=sum/n;
        System.out.println("average="+avg);
        for(int i=0;i<n;i++){
            dev=totalmarks[i]-avg;
            System.out.println("deviation="+dev);
        }
        sc.close();
    }
}