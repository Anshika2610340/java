class mythread4 extends Thread{
    int arr1[][]={{1,2,3},{2,3,4}};
    int arr2[][]={{2,3,4},{3,4,5},{4,5,6}};
    int n1=arr1.length;
    int n2=arr2.length;
    int r1=arr1[0].length;
    int r2=arr2[0].length;
    public void run(){
        if(r1!=n2){
            System.out.println("matrix multiplication not possible!");
        }
        else{
            int arr3[][]=new int[n1][r2];
            for(int i=0;i<n1;i++){
                for(int j=0;j<r2;j++){
                    for(int k=0;k<r1;k++){
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int[] element:arr3){
                for(int element2:element){
                    System.out.print(element2+" ");
                }
                System.out.println();
            }
        }
    }
}
public class Practisequestion190 {
    public static void main(String[] args) {
        /*Write a Java program that performs matrix multiplication using multiple threads.*/
        mythread4 t4=new mythread4();
        t4.start();
    }
}
