package OOPs;

abstract class Shape{
    abstract double area();
}

class Rectangle extends Shape{
    private double length;
    private double bredth;

    Rectangle(double length, double bredth){
        this.length = length;
        this.bredth = bredth;
    }

    @Override

    double area(){
         return length*bredth;
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Rectangle(12.9, 34.5);
        System.out.println("Area of Rectangle is");
    }
}
