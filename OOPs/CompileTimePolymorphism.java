package OOPs;

public class CompileTimePolymorphism {
    public void display(String name){
        System.out.println("The name is :" +name);
    }

    public void display(int age){
        System.out.println("The age is :"+age);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism ctp = new CompileTimePolymorphism();
        
        ctp.display("krishna");
        ctp.display(27);
    }
}
