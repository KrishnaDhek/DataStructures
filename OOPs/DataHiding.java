package OOPs;

class Rectangle{
    private int length;
    private int bredth;
    
    public int getLength(){
     return length;
    }

    public int getBredth(){
        return bredth;
    }
    
    public void setLength(int l){
        length = l;
    }
    
    public void setBredth(int b){
        bredth = b;
    }

    public int area(){
        return length*bredth;
    }
   


}
public class DataHiding {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setBredth(20);
        System.out.println("The area of rectangle is: "+rect.area());
    }
    
}
