package LeetCodeSolutions;

public class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            current = current.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next;
    }
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        
        // Example 1: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8
        AddTwoNumbers.ListNode l1 = addTwoNumbers.new ListNode(2, addTwoNumbers.new ListNode(4, addTwoNumbers.new ListNode(3)));
        AddTwoNumbers.ListNode l2 = addTwoNumbers.new ListNode(5, addTwoNumbers.new ListNode(6, addTwoNumbers.new ListNode(4)));
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        printList(result);
    }
    
    // Helper function to print the linked list
    private static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val);
            if (list.next != null) {
                System.out.print(" -> ");
            }
            list = list.next;
        }
        System.out.println();
    }
    }

