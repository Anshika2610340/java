import java.util.Scanner;
public class Practisequestion80 {
    public static void main(String[] args) {
        /*Write a program to input twenty names in an array. Arrange these names in descending order of letters, using the bubble sort technique. */
        Scanner sc=new Scanner(System.in);
        String names[]=new String[20];
        System.out.println("enter the names");
        for(int i=0;i<20;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<20;i++){
            for(int j=0;j<20-1-i;j++){
                if(names[j].compareToIgnoreCase(names[j+1])<0){
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<20;i++){
            System.out.println(names[i]+"\t");
        }
        sc.close();
    }
}