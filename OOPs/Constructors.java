package OOPs;
class Box{
    private int length;
    private int width;
    private int breadth;

    public  Box(){
        this.length =1;
        this.breadth =1;
        this.width =1;

    }

    public int area(){
        return length*breadth*width;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.area());
    }
}
