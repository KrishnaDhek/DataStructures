package PatternsForCoding.FastAndSlowPointer;
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        val = data;
        next = null;
    }
}
public class StartOfCycle {
    public static ListNode StartOfCycle(ListNode head){

        if(head ==null || head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        boolean detectCycle = false;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                detectCycle = true;
                break;
            }
        }

        if(!detectCycle){
            return null;
        }

        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next.next;

        ListNode cycleNode = StartOfCycle(head);
        if(cycleNode!=null){
            System.out.println("Cycle detected at node " + cycleNode.val);
        }
        else{
            System.out.println("Cycle not detected");
        }
    }
    
}
