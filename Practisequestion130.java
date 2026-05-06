import java.util.Scanner;
class parkinglot{
    int vno, hours;
    double bill;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter vehicle no:");
        vno=sc.nextInt();
        System.out.println("enter hours:");
        hours=sc.nextInt();
        sc.close();
    }
    public void calculate(){
        if(hours<=1){
            bill=3;
        }
        else{
            bill=3+(hours-1)*1.50;
        }
    }
    public void display(){
        System.out.println("vehicle number:"+vno);
        System.out.println("hours tracked:"+hours);
        System.out.println("bill calculated:"+bill);
    }
}
public class Practisequestion130 {
    public static void main(String[] args) {
        /*Define a class called ParkingLot with the following description:
        Instance variables/data members:
        int vno — To store the vehicle number.
        int hours — To store the number of hours the vehicle is parked in the parking lot.
        double bill — To store the bill amount.
        Member Methods:
        void input() — To input and store the vno and hours.
        void calculate() — To compute the parking charge at the rate of ₹3 for the first hour or part thereof, and ₹1.50 for each additional hour or part thereof.
        void display() — To display the detail.
        Write a main() method to create an object of the class and call the above methods. */
        parkinglot p=new parkinglot();
        p.input();
        p.calculate();
        p.display();
    }
}
