import java.util.Scanner;
public class Practisequestion104 {
    public void polygon(int n,char ch){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public void polygon(int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }
    public void polygon(){
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*Design a class to overload a function polygon() as follows:
        void polygon(int n, char ch) — with one integer and one character type argument to draw a filled square of side n using the character stored in ch.
        void polygon(int x, int y) — with two integer arguments that draws a filled rectangle of length x and breadth y, using the symbol '@'.
        void polygon() — with no argument that draws a filled triangle shown below:
        Example:
        Input value of n=2, ch = 'O'
        Output:
        OO
        OO
        Input value of x = 2, y = 5
        Output:
        @@@@@
        @@@@@
        Output:
        *
        **
        *** */
       Scanner sc=new Scanner(System.in);
       Practisequestion104 obj=new Practisequestion104();
       System.out.println("enter integer and character:");
       int a=sc.nextInt();
       char ch=sc.next().charAt(0);
       obj.polygon(a,ch);
       System.out.println("enter integers:");
       int x=sc.nextInt();
       int y=sc.nextInt();
       obj.polygon(x,y);
       obj.polygon();
       sc.close();
    }
}
