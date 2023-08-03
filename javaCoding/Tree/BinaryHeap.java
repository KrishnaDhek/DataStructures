package Tree;

public class BinaryHeap {
    int[] arr ;
    int sizeOfHeap;

    public BinaryHeap(int size){
        arr = new int[size+1];//beacuse the first 0th index does not stores any value
        this.sizeOfHeap = 0;
        System.out.println("Successfully created binary heap");
    }

    public boolean isEmpty(){
        if(sizeOfHeap==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int PeekOfHeap(){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        else{
            return arr[1];
        }
    }
}
