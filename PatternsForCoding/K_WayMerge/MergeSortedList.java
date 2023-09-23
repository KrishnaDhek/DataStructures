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
        head.next.next = new Node(6);
        head.next.next.next = new Node(10);

        Node head2 = new Node(4);
        head2.next = new Node(8);
        head2.next.next = new Node(17);
        head2.next.next.next = new Node(29);

        Node temp = mergeList(head,head2);

        while(temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");

    }
    
}
