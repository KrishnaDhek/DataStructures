package PatternsForCoding.FastAndSlowPointer;
class LinkedNode{
    LinkedNode next;
    int data;
    LinkedNode(int val){
        data = val;
        next = null;
    }
}
public class ReverseList {
    public static LinkedNode ReverseList(LinkedNode head){

    
    LinkedNode front =null;
    LinkedNode rear = head;
    LinkedNode temp;
    if(head==null){
        return head;
    }
    while(rear!=null){
        temp = rear.next;
        rear.next= front;
        front = rear;
        rear = temp;
    }
    return front;
}

public static void printList(LinkedNode head){
    LinkedNode temp = head;
    System.out.println("Original Linked List");
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println(" ");

}
public static void main(String[] args) {
    LinkedNode head = new LinkedNode(1);
    head.next = new LinkedNode(2);
    head.next.next = new LinkedNode(3);
    head.next.next.next = new LinkedNode(4);
    head.next.next.next.next = new LinkedNode(5);
    printList(head);
    LinkedNode temp = ReverseList(head);
    System.out.println("Linked List after Reversal");
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.print("null");

}
    
}
