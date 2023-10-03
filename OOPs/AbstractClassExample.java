package OOPs;

abstract class Shapes{
    abstract void draw();

    void fillColor(){
        System.out.println("Filling color ...");
    }
}

class Triangle extends Shapes{
    void draw(){
        System.out.println("Drawing a triangle  ");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.fillColor();

        Shapes s = new Triangle();
        s.draw();
        s.fillColor();
    }
}
