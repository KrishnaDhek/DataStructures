package OOPs;

interface Interf{
    // every interfqce method is public and abstract
    void meth1();
    void meth2();
}

abstract class Test implements Interf{
    public void meth1(){
        System.out.println("This is method 1");
    }

}

class Sample extends Test{
    public void meth2(){
        System.out.println("This is method 2");
    }

    void meth3(){
        System.out.println("This is method 3");
    }
}
public class Interface {
    public static void main(String[] args) {
       Interf i = new Sample();
       i.meth1();
       i.meth2();
    //    i.meth3(); beacuse method 3 is not declared inside the interface interf

    }
    
    
}
