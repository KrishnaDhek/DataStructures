package OOPs;

class Rectangle{
    private int length;
    private int bredth;
    
    public int getLength(){
     return length;
    }
    
    public void setLength(int l){
        length = l;
    }
    

   


}
public class DataHiding {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
    }
    
}
