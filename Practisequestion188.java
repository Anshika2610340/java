class mythread1 extends Thread{
    public void run(){
        int n=1;
        while(n<=20){
            if(n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int n=1;
        while(n<=20){
            if(n%2!=0){
                System.out.println(n);
            }
            n++;
        }
    }
}
public class Practisequestion188 {
    public static void main(String[] args) {
        /*Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.*/
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}
