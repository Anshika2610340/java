public class Practisequestion70 {
    public static void main(String[] args) {
        /*Write a program in Java to display the following pattern:
        5 4 3 2 1 
        4 3 2 1 
        3 2 1 
        2 1 
        1 */
        int num=5;
        int temp=num;
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(num);
                num--;
            }
            num=temp-1;
            temp--;
            System.out.println();
        }
    }
}