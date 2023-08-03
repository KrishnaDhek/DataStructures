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

    public int SizeOfHeap(){
        return sizeOfHeap;
    }

    // levelOrderTraversal

    public void levelOrderTraversal(){
        for(int i=1; i<=sizeOfHeap; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }
    //heapify method
    public void heapifyBottomToTop(int index, String typeOfHeap){
        int parent = index/2;
        if(index<=1){
            return;
        }
       if(typeOfHeap == "MinHeap"){
            if(arr[index]<arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent]= temp;
            }
        }
        else if(typeOfHeap =="MaxHeap"){
            if(arr[index]>arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, typeOfHeap);
    }
    // insert in head

    public void insertInBinaryHeap(int value, String typeOfHeap){
        arr[sizeOfHeap+1] = value;
        sizeOfHeap++;
        heapifyBottomToTop(sizeOfHeap, typeOfHeap);
        System.out.println("Inserted "+value+" successfully in Heap");

    }
}
