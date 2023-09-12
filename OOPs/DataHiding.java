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
        if(l>0){
            length = l;
        }
        else{
            System.out.println("++Invalid Length++");
        }
    }
    
    public void setBredth(int b){
        bredth = b;
    }

    public int area(){
        return length*bredth;
    }
   
    public int parameter(){
        return (length+bredth)*2;
    }


}
public class DataHiding {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(0);
        rect.setBredth(20);
        System.out.println("The area of rectangle is: "+rect.area());
        System.out.println("Parameter of rectangle :"+rect.parameter());
    }
    
}
