package Array;

public class Stack {
    int[] arrStack;
    int topOfStack;

    public Stack(int size){
        this.arrStack = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with size "+size);
    }

    //isEmpty method

    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }
        return false;
    }
    
}
