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
    
    //isFull
    public boolean isFull(){
        if(topOfStack==arrStack.length-1){
            return true;
        }
        return false;
    }

    //push method
    public void Push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            topOfStack++;
            arrStack[topOfStack] = value;
            System.out.println("Value is successfully added "+value);

        }
    }
    //pop method
    public int Pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        else{
            int topValue = arrStack[topOfStack];
            topOfStack--;
            return topValue;
        }
    }
    //peek method

    public int Peek(){
        if(isEmpty()){
            System.out.println("stack is empty!");
            return -1;
        }
        else{
            int value  = arrStack[topOfStack];
            return value;
        }
    }

    //delete stack
    public void delete(){
        arrStack =null;
        System.out.println("Successfully deleted the stack!");
    }
}
