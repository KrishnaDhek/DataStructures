// LeetCode 21 Merge Sorted List
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list. The list should be made by 
// splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

package LeetCodeSolutions;

import LeetCodeSolutions.MergeTwoSortedList.ListNode;

public class MergeTwoSortedList {
    public static class ListNode {
    int val;
    ListNode next;
    ListNode() {
        
    }
    ListNode(int val) {
         this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

    public static ListNode mergeTwoSorLists(ListNode l1, ListNode l2){
        ListNode head ;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        if(l1.val<l2.val){
            head = l1;
            head.next = mergeTwoSorLists(l1.next, l2);
        }
        else{
            head =l2;
            head.next =mergeTwoSorLists(l2.next, l1);
        }
        return head;
    }
    public static ListNode append(ListNode head, int val) {
        if (head == null) {
            return new ListNode(val);
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
        return head;
    }
    
    public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
        append(list1, 3);
        append(list1, 5);
        
    ListNode list2 = new ListNode(2);
            append(list2, 4);
            append(list2, 6);
    ListNode merge= mergeTwoSorLists(list1, list2);
        
    while(merge!=null){
            System.out.print(merge.val +"->");
            merge = merge.next;
        }
        System.out.println("null");

    }
}
