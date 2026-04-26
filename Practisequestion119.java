import java.util.Scanner;
class steptracker{
    String name;
    int sw;
    double cb,km;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        name=sc.next();
        System.out.println("enter the steps walked:");
        sw=sc.nextInt();
        sc.close();
    }
    public void calculate(){
        cb=sw*0.04;
        km=sw/1300;
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("calorie burned:"+cb);
        System.out.println("km:"+km);
    }
}
public class Practisequestion119 {
    public static void main(String[] args) {
        /*Define a class named StepTracker with the following specifications:
        Member Variables:
        String name – stores the user's name
        int sw – stores the total number of steps walked by the user.
        double cb – stores the estimated calories burned by the user.
        double km – stores the estimated distance walked in kilometers.
        Member Methods:
        void accept() – to input the name and the steps walked using Scanner class methods only.
        void calculate() – calculates calories burned and distance in km based on steps walked using the following estimation table:
        Metric	Calculation Formula
        Calories Burned	steps walked x 0.04 (e.g., 1 step burns 0.04 calories)
        Distance (Km)	steps walked / 1300 (e.g., 1300 steps is approx. 1 km)
        void display() – Display the calories burned, distance in km and the user's name.
        Write a main method to create an object of the class and invoke the methods. */
        steptracker step=new steptracker();
        step.accept();
        step.calculate();
        step.display();
    }
}