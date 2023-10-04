package OOPs;

abstract class SHP{
    abstract double area();
}

class Rect extends SHP{
    private double length;
    private double bredth;

    Rect(double length, double bredth){
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
        SHP s = new Rect(12.9, 34.5);
        System.out.println("Area of Rectangle is :" +s.area());
    }
}
