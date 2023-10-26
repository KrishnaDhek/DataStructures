package OOPs;

interface Shape{
    double area();
    double parimeter();
}

class Rectangle implements Shape{
    private double len, width;

    public Rectangle(double len, double width){
        this.len = len;
        this.width = width;
    }
    @Override
    public double area(){
        return len*width;
    }
    @Override
    public double parimeter(){
        return 2*(len+width);
    }
}

class Circle implements Shape{
    private double radius;
    private final double pi = 3.14159;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return pi*radius*radius;
    }
    @Override
    public double parimeter(){
        return 2*pi*radius;
    }
}
public class InterfaceExample {
    
}
