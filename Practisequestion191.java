class mythread5 extends Thread{
    public void run(){
        int n=9;
        int sum=0;
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
public class Practisequestion191 {
    public static void main(String[] args) {
        /*Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.*/
        mythread5 t5=new mythread5();
        t5.start();
    }
}
