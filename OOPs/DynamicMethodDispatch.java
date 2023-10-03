package OOPs;
class SuperClass{
    public  void meth1(){ // Dynamic method concept works on instance method(non-static)
        System.out.println("Method 1 of superClass");
    }

    public  void meth2(){
        System.out.println("Method 2 of superClass");
    }

    public  void meth3(){
        System.out.println("Method 3 of supeClass");
    }
}
class SubClass extends SuperClass{
    public  void meth1(){
        System.out.println("Method 1 of subClass");
    }

    public  void meth2(){
        System.out.println("Method 2 of subClass");
    }

    public  void meth3(){
        System.out.println("Method 3 of subClass");
    }

    public  void meth4(){
        System.out.println("Method 3 of subClass");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        SuperClass sup = new SubClass();// dynamic method dispatch, allows JVM to resolve at 
        // runtime which version of overriden method will be executed based on the actual type of object 
        // and not its reference type
        sup.meth1();
        sup.meth2();
        sup.meth3();
        // sup.meth4();  this will cause error as super class does not contain amy method 4

    }
    
}
