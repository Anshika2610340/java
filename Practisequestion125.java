import java.util.Scanner;
class student{
    String name,stream;
    int age,marks;
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter age:");
        age=sc.nextInt();
        System.out.println("enter marks:");
        marks=sc.nextInt();
        sc.close();
    }
    public void allocation(){
        if(marks>=300){
            stream="science and computer";
        }
        else if(marks>=200 && marks<300){
            stream="commerce and computer";
        }
        else if(marks>=75 && marks<200){
            stream="arts and animation";
        }
        else{
            stream="try again";
        }
    }
    public void print(){
        System.out.println("name\tage\tmarks\tstream");
        System.out.println(name+"\t"+age+"\t"+marks+"\t"+stream);
    }
}
public class Practisequestion125 {
    public static void main(String[] args) {
        /*Design a class with the following specifications:
        Class name: Student
        Member variables:
        String name — name of student
        int age — age of student
        int mks — marks obtained
        String stream — stream allocated
        (Declare the variables using appropriate data types)
        Member methods:
        void accept() — Accept name, age and marks using methods of Scanner class.
        void allocation() — Allocate the stream as per following criteria:
        mks	stream
        >= 300	Science and Computer
        >= 200 and < 300	Commerce and Computer
        >= 75 and < 200	Arts and Animation
        < 75	Try Again
        void print() – Display student name, age, mks and stream allocated.
        Call all the above methods in main method using an object. */
        student s=new student();
        s.accept();
        s.allocation();
        s.print();
    }
}