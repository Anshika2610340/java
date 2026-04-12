public class Codedecodegrade{
    public static void main(String[] args){
        char grade='A';
        //coding of grades
        char codedgrade=(char)(grade +8);
        System.out.println("the coded grades are:"+codedgrade);
        //decoding of the grades
        char decodedgrade=(char)(codedgrade-8);
        System.out.println("the decoded grades are:"+decodedgrade);
    }
}
