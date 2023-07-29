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
        System.out.println("Does linked list contains the value? "+sll.searchInSinglyLinkedList(8));
        // sll.deleteFromLinkedList(0);
        // sll.traversalInSinglyLinkedList();
        sll.deleteFromLinkedList(3);
        sll.traversalInSinglyLinkedList();
        sll.deleteFromLinkedList(4);
        sll.traversalInSinglyLinkedList();
        sll.deleteFromLinkedList(0);
        sll.traversalInSinglyLinkedList();
    }
    
}
