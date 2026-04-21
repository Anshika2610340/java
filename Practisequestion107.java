import java.util.Scanner;
public class Practisequestion107 {
    public static void main(String[] args) {
        /*Write a program to input and store roll numbers, names and marks in 3 subjects of n number of students in five single dimensional arrays and display the remark based on average marks as given below:
        Average Marks	Remark
        85 — 100	Excellent
        75 — 84	Distinction
        60 — 74	First Class
        40 — 59	Pass
        Less than 40	Poor */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of students:");
        int n=sc.nextInt();
        int rollno[]=new int[n];
        String names[]=new String[n];
        int s1[]=new int[n];
        int s2[]=new int[n];
        int s3[]=new int[n];
        int avg[]=new int[n];
        System.out.println("enter details:");
        for(int i=0;i<n;i++){
            System.out.println("enter rollno:");
            rollno[i]=sc.nextInt();
            System.out.println("enter name:");
            names[i]=sc.next();
            System.out.println("enter marks:");
            s1[i]=sc.nextInt();
            s2[i]=sc.nextInt();
            s3[i]=sc.nextInt();
            avg[i]=(s1[i]+s2[i]+s3[i])/3;
        }
        for(int i=0;i<n;i++){
            if(avg[i]>85 && avg[i]<100){
                System.out.println("excellent");
            }
            else if(avg[i]>75 && avg[i]<=84){
                System.out.println("distinction");
            }
            else if(avg[i]>60 && avg[i]<=74){
                System.out.println("first class");
            }
            else if(avg[i]>40 && avg[i]<=59){
                System.out.println("pass");
            }
            else{
                System.out.println("poor");
            }
        }
        sc.close();
    }
}