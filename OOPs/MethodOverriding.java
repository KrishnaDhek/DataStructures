package OOPs;

class Super{
    public void display(){
        System.out.println("Super class method");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub-Class method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super su = new Sub();
        su.display();
        
    }
    
}
