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
public class InterfaceExample {
    
}
