package OOPs;

class Animals{

    public void Sound()
    {
        System.out.println("Animal make a sound ");
    }
}

class Cat extends Animals{
    public void Sound(){
        System.out.println("Cat meows ");
    }
}

class Elephant extends Animals{
    public void Sound(){
        System.out.println("Elephant  snorts");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animals a;
        a = new Cat();
        a.Sound();
        a = new Elephant();
        a.Sound();
    }
}
