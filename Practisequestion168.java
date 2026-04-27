interface resizable{
    public int resizewidth(int width);
    public int resizehieght(int hieght);
}
class rectangle1 implements resizable{
    int height1,width1;
    rectangle1(int width1,int height1){
        this.height1=height1;
        this.width1=width1;
    }
    public int resizewidth(int width){
        width1+=width;
        return width1;
    }
    public int resizehieght(int height){
        height1+=height;
        return height1;
    }
}
public class Practisequestion168 {
    static void main() {
        /* Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized.
    Create a class Rectangle that implements the Resizable interface and implements the resize methods.*/
        rectangle1 r=new rectangle1(23,56);
        int a1=r.resizehieght(34);
        int b1=r.resizewidth(23);
        System.out.println(a1);
        System.out.println(b1);
    }
}
