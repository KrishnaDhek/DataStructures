package PatternsForCoding.FastAndSlowPointer;

import java.util.List;

class Node{
    Node next;
    int value;

    Node(int data){
        this.value = data;
        this.next=null;
    }
}


 class LinkedListCycle{
    public static boolean hasCycle(Node head){
   
    Node fast = head;
    Node slow = head;

    while(fast!=null  && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow ==fast){
            return true;
        }
    }
    return false;


}
   public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = head.next;
    System.out.println(hasCycle(head));

   }


}