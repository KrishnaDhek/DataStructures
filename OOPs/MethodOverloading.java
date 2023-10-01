package OOPs;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading methOver = new MethodOverloading();

        System.out.println("Sum of Integers is :" methOver.Sum(20,-9));
         System.out.println("Sum of Integers is :" methOver.Sum(20.98,45.8));
          System.out.println("Sum of Integers is :" methOver.Sum(20,40,-9));
    }
    
}
