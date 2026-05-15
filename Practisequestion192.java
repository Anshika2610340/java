class mythread6 implements Runnable{
    public void run(){
        System.out.println("running website 1..");
    }
}
class mythread7 implements Runnable{
    public void run(){
        System.out.println("running website 2...");
    }
}
public class Practisequestion192 {
    public static void main(String[] args) {
        /*Write a Java program to implement a concurrent web crawler that crawls multiple websites simultaneously using threads.*/
        mythread6 t6=new mythread6();
        Thread gun1=new Thread(t6);
        mythread7 t7=new mythread7();
        Thread gun2=new Thread(t7);
        gun1.start();
        gun2.start();
    }
}
