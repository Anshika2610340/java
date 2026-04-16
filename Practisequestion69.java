public class Practisequestion69 {
    public static void main(String[] args) {
        /*Write a program in Java to display the following pattern:
        1 
        2 2 
        3 3 3 
        4 4 4 4 
        5 5 5 5 5 */
        int num=1;
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
}