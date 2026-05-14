class mythread3 implements Runnable{
    int arr[]={1,3,2,6,9,7,8};
    int n=arr.length;
    public void run(){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }
}
public class Practisequestion189 {
    public static void main(String[] args) {
        /*Write a Java program that sorts an array of integers using multiple threads.*/
        mythread3 t3=new mythread3();
        Thread gun1=new Thread(t3);
        gun1.start();
    }
}
