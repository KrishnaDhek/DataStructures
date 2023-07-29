package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.createSinglyLinkedList(1);
        // System.out.println(sll.head.value);
        sll.insertInSinglyLinkedList(1, 0);
        sll.insertInSinglyLinkedList(2, 1);
        sll.insertInSinglyLinkedList(3, 2);
        sll.insertInSinglyLinkedList(4, 1);
        sll.insertInSinglyLinkedList(5, 4);
        sll.insertInSinglyLinkedList(6, 5);
        sll.insertInSinglyLinkedList(7, 3);
        // System.out.println(sll.head.value);
        // System.out.println(sll.head.next.value);
        // System.out.println(sll.head.next.next.value);
        // System.out.println(sll.head.next.next.next.value);
        // System.out.println(sll.head.next.next.next.next.value);
        sll.traversalInSinglyLinkedList();
       
    }
    
}
