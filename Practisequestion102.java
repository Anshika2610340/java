import java.util.Scanner;
public class Practisequestion102 {
    public static void main(String[] args) {
        /*Write a program to input and sort the weight of ten people. Sort and display them in descending order using the selection sort technique. */
        Scanner sc=new Scanner(System.in);
        double weight[]=new double[10];
        System.out.println("enter weights:");
        for(int i=0;i<10;i++){
            weight[i]=sc.nextDouble();
        }
        int idx=0;
        for(int i=0;i<9;i++){
            idx=i;
            for(int j=i+1;j<10;j++){
                if(weight[j]>weight[idx]){
                    idx=j;
                }
            } 
            double temp=weight[i];
                weight[i]=weight[idx];
                weight[idx]=temp;       
        }
        System.out.println("sorted array:");
        for(int i=0;i<10;i++){
            System.out.print(weight[i]+"\t");
        }
        sc.close();
    }
}