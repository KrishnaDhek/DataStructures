package Tree;

public class HeapMain {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(8);
        heap.PeekOfHeap();
        System.out.println(heap.SizeOfHeap());
        System.out.println("Binary Tree Traversal :");
        heap.levelOrderTraversal();
        heap.insertInBinaryHeap(5,  "MinHeap");
        heap.insertInBinaryHeap(10, "MinHeap");
        heap.insertInBinaryHeap(20, "MinHeap");
        heap.insertInBinaryHeap(30, "MinHeap");
        heap.insertInBinaryHeap(40, "MinHeap");
        heap.insertInBinaryHeap(50, "MinHeap");
        heap.insertInBinaryHeap(60, "MinHeap");
        heap.insertInBinaryHeap(1, "MinHeap");
        heap.levelOrderTraversal();
        heap.extractHeadofHeap("MinHeap");
        heap.levelOrderTraversal();
        heap.extractHeadofHeap("MinHeap");
        heap.levelOrderTraversal();
    }
    
}
