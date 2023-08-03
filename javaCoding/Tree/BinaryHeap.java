package Tree;

public class BinaryHeap {
    int[] arr ;
    int sizeOfHeap;

    public BinaryHeap(int size){
        arr = new int[size+1];//beacuse the first 0th index does not stores any value
        this.sizeOfHeap = 0;
        System.out.println("Successfully created binary heap");
    }
    
}
