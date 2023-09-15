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
    public double area(){
        return Math.PI*Radius*Radius;
    }
    public String toString(){
        return "Radius of circle is :"+Radius+"\n"+"Area of Circle is :"+area();
    }
    
} 

class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();

    }
    public Cylinder(Circle c){
        super(c.getRadius());

    }
    public Cylinder( double h){
        
        setheight(h);
    }
    
    

    public void setheight(double h){
        if(h>0){
            this.height = h;
        }
        else{
            System.out.println("Height can not be negative !");
        }
    }

    public double Volume(){
        return Math.PI*getRadius()*height;
    }
    public String toString(){
        return "Radius of cylinder is :"+getRadius()+"\n"+"Height of cyclinder is :"+height+"\n"+"Volume of Cylinder is :"+Volume();
    }
    
}
public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(9);
        System.out.println("+++++++Details of Circle++++++");
        System.out.println(c);
        Cylinder cy = new Cylinder(c);
        cy.setheight(2.1);
        System.out.println("**********Details of Cylinder*********");
        System.out.println(cy);
    }
    
}
