package PatternsForCoding.FastAndSlowPointer;

class listNode{
    int data;
     listNode next;
     listNode(int val){
        data = val;
        next = null;
     }
}

public class MidLinkedList {
    public static listNode midOfList(listNode head){
        listNode fast = head;
        listNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next =new listNode(4);
        head.next.next.next.next =new listNode(5);
        head.next.next.next.next.next= new listNode(6);
        listNode mid = midOfList(head);
        if(mid!=null){
            System.out.println("Middle of linked list is :" +mid.data);
        }
       
    }
    
}
