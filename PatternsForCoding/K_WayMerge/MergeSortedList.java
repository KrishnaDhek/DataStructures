package PatternsForCoding.K_WayMerge;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class MergeSortedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = new Node(5);

        Node head2 = new Node(4);
        head2.next = new Node(6);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(9);

        Node temp = mergeList(head,head2);

    }
    
}
