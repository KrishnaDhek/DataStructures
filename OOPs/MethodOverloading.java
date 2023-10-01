package OOPs;

public class MethodOverloading {

  int Sum(int i, int j){
    return i+j;
  }

  double Sum(double i, double j){
    return i+j;
  }

  int Sum(int i , int j, int k){
    return i+j+k;
  }
    public static void main(String[] args) {
        MethodOverloading methOver = new MethodOverloading();

        System.out.println("Sum of two Integers is :"+ methOver.Sum(20,-9));
         System.out.println("Sum of two Double is :" +methOver.Sum(20.98,45.8));
          System.out.println("Sum of three Integers is :" +methOver.Sum(20,40,-9));
    }
    
}
