package PatternsForCoding.FastAndSlowPointer;
class LinkNode{
    LinkNode next;
    int data;
    LinkNode(int val){
        data = val;
        next = null;
    }
}
public class ReverseLinkedList {
    public static LinkNode ReverseListBetween(LinkNode head, int left, int right){

        if (head == null || left == right) {
            return head;
        }

        LinkNode dummy = new LinkNode(0);
        dummy.next = head;
        LinkNode prev = dummy;

        // Move prev to the node just before the left-th node
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        LinkNode start = prev.next;
        LinkNode then = start.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    
}

// public static void printList(LinkedNode head){
//     LinkedNode temp = head;
//     System.out.println("Original Linked List");
//     while(temp!=null){
//         System.out.print(temp.data+"->");
//         temp = temp.next;
//     }
//     System.out.print("null");
//     System.out.println(" ");

// }
public static void main(String[] args) {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(5);
    // printList(head);
    LinkNode temp = ReverseListBetween(head,2,4);
    // System.out.println("Linked List after Reversal");
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.print("null");

}
}
    
