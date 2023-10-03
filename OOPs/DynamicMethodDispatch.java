package OOPs;
class SuperClass{
    public static void meth1(){
        System.out.println("Method 1 of superClass");
    }

    public static void meth2(){
        System.out.println("Method 2 of superClass");
    }

    public static void meth3(){
        System.out.println("Method 3 of supeClass");
    }
}
class SubClass extends SuperClass{
    public static void meth1(){
        System.out.println("Method 1 of subClass");
    }

    public static void meth2(){
        System.out.println("Method 2 of subClass");
    }

    public static void meth3(){
        System.out.println("Method 3 of subClass");
    }

    public static void meth4(){
        System.out.println("Method 3 of subClass");
    }
}
public class DynamicMethodDispatch {
    
}
