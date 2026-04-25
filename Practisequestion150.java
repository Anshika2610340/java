class shape3{
    int dim1,dim2;
    public shape3(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public int getperimeter(){
        int perimeter=2*(dim1+dim2);
        return perimeter;
    }
    public int getarea(){
        int area=dim1*dim2;
        return area;
    }
}
class circle2 extends shape3{
    public circle2(int dim1,int dim2){
        super(dim1,dim2);
    }
    @Override
    public int getperimeter(){
        return (int)(2*Math.PI*dim1);
    }
    public int getarea(){
        return (int)(Math.PI*dim1*dim2);
    }
}
public class Practisequestion150 {
    public static void main(String[] args) {
        /*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
        Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.*/
        circle2 c=new circle2(2,2);
        System.out.println(c.getperimeter());
        System.out.println(c.getarea());
    }
}
