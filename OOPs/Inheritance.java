package OOPs;
class Circle{
    private int Radius;
    public Circle(){

    }

    public Circle(int r){
        setRadius(r);
    }

    public int getRadius(){
        return Radius;
    }
    public void setRadius(int r){
        if(r>0){
            this.Radius = r;
        }
        else{
            System.out.println("Radius cant be negative!");
        }
    }

    public String toString(){
        return "Radius of circle is :"+Radius;
    }
} 

class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();

    }
    public Cylinder(int r, double h){
        super(r);
        setheight(h);
    }
    
    public Cylinder(Circle c){
        super(c.getRadius());

    }

    public void setheight(double h){
       this.height = h;
    }
    public String toString(){
        return "Radius of cylinder is :"+getRadius()+"\n"+"Height of cyclinder is :"+height;
    }
    
}
public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(9);
        System.out.println(c);
        Cylinder cy = new Cylinder(c);
        cy.setheight(2.1);
        System.out.println(cy);
    }
    
}
