package OOPs;
class Box{
    private int length;
    private int width;
    private int breadth;

    public Box(){//constructor chaining
        this(1, 1, 1);//call to parameterized constructor

    }
    public Box(int length, int width, int breadth){
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }
    

    public int volume(){
        return length*breadth*width;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(10, 20, 12);
        System.out.println(box.volume());
        System.out.println(box1.volume());
    }
}
