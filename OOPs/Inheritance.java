package OOPs;
class Circle{
    private int Radius;
    public Circle(){

    }

    public Circle(int r){
        setRadius(Radius);
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
public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(2);
        System.out.println(c);
    }
    
}
