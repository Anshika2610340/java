abstract class Shape2D {
    abstract void draw();
    abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    void resize() {
        System.out.println("Resizing a rectangle...");
    }
}

class Circle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    void resize() {
        System.out.println("Resizing a circle...");
    }
}

public class Practisequestion161 {
    public static void main(String[] args) {
        Shape2D r = new Rectangle();
        r.draw();
        r.resize();

        Shape2D c = new Circle();
        c.draw();
        c.resize();
    }
}