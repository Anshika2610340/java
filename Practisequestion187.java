class thread1 extends Thread{
    public void run(){
        System.out.println("hello,world!");
    }
}
public class Practisequestion187 {
    public static void main(String[] args) {
        /*Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.*/
        thread1 t1=new thread1();
        t1.start();
    }
}
