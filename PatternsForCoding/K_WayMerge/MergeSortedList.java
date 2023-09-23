package PatternsForCoding.K_WayMerge;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class MergeSortedList {

    public static Node mergeList(Node l1, Node l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;

        Node temp;

        if(l1.data<l2.data){
            temp = l1;
            temp.next = mergeList(l1.next, l2);
        }
        else{
            temp = l2;

            temp.next = mergeList(l1, l2.next);
        }

        return temp;
    }
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
