import java.util.Scanner;
public class Practisequestion74 {
    public static void main(String[] args) {
        /*Write a program to store 6 elements in an array P and 4 elements in an array Q. Now, produce a third array R, containing all the elements of array P and Q. Display the resultant array. */
        Scanner sc=new Scanner(System.in);
        int p[]=new int[6];
        int q[]=new int[4];
        System.out.println("enter elements in p");
        for(int i=0;i<p.length;i++){
            p[i]=sc.nextInt();
        }
        System.out.println("enter elements in q");
        for(int j=0;j<q.length;j++){
            q[j]=sc.nextInt();
        }
        int r[]=new int[10];
        int i=0;
        while(i<p.length){
            r[i]=p[i];
            i++;
        }
        int j=0;
        while(j<q.length){
            r[i++]=q[j++];
        }
        System.out.println("displaying elements");
        for(int k=0;k<r.length;k++){
            System.out.println(r[k]);
        }
        sc.close();
    }
}