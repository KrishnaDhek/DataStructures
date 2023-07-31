package Array;

public class Main {
   public static void main(String[] args) {
    Stack s = new Stack(5);
    System.out.println("Is stack empty ? "+ s.isEmpty());
    System.out.println("Is stack full ? "+ s.isFull());
    s.Push(1);
    s.Push(2);
    s.Push(27);
    s.Push(78);
    s.Push(3);
    s.Push(9);//stack is full
    System.out.println("Popped element is :"+s.Pop());
    System.out.println("Peek element is :"+s.Peek());
    
   }
    
}
