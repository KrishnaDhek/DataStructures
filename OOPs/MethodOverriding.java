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
        //with the feature of Dynamic method dispath, method executed Based on the object, not on
        // the type of reference it refers  
        Super su = new Sub();
        su.display();
        
    }
    
}
