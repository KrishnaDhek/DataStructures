package LinkedList;

public class Main {
    public static void main(String[] args) {
        // SinglyLinkedList sll = new SinglyLinkedList();
        // // sll.createSinglyLinkedList(1);
        // // System.out.println(sll.head.value);
        // sll.insertInSinglyLinkedList(1, 0);
        // sll.insertInSinglyLinkedList(2, 1);
        // sll.insertInSinglyLinkedList(3, 2);
        // sll.insertInSinglyLinkedList(4, 1);
        // sll.insertInSinglyLinkedList(5, 4);
        // sll.insertInSinglyLinkedList(6, 5);
        // sll.insertInSinglyLinkedList(7, 3);
        // // System.out.println(sll.head.value);
        // // System.out.println(sll.head.next.value);
        // // System.out.println(sll.head.next.next.value);
        // // System.out.println(sll.head.next.next.next.value);
        // // System.out.println(sll.head.next.next.next.next.value);
        // sll.traversalInSinglyLinkedList();
        // System.out.println("Does linked list contains the value? "+sll.searchInSinglyLinkedList(8));
        // // sll.deleteFromLinkedList(0);
        // // sll.traversalInSinglyLinkedList();
        // sll.deleteFromLinkedList(3);
        // sll.traversalInSinglyLinkedList();
        // sll.deleteFromLinkedList(4);
        // sll.traversalInSinglyLinkedList();
        // sll.deleteFromLinkedList(0);
        // sll.traversalInSinglyLinkedList();
        // sll.deleteSinglyLinkedList();
        // sll.deleteFromLinkedList(0);

        // CircularLinkedList cll = new CircularLinkedList();
        // // cll.createCircularSinglyLinkedList(1);
        // // System.out.println(cll.head.value);
        // cll.insertInCircularSinglyLinkedList(1, 0);
        // cll.insertInCircularSinglyLinkedList(2, 1);
        // cll.insertInCircularSinglyLinkedList(3, 2);
        // cll.insertInCircularSinglyLinkedList(4, 3);
        // cll.insertInCircularSinglyLinkedList(5, 2);
        // cll.insertInCircularSinglyLinkedList(6, 1);
        // // System.out.println(cll.head.value);
        // // System.out.println(cll.head.next.value);
        // // System.out.println(cll.head.next.next.value);
        // // System.out.println(cll.head.next.next.next.value);
        // // System.out.println(cll.head.next.next.next.next.value);
        // // System.out.println(cll.head.next.next.next.next.next.value);
        // cll.traverseCircularLinkedList();
        // System.out.println("Is the value present ? "+cll.searchInCircularSinglyLinkedList(3));
        // cll.traverseCircularLinkedList();
        // cll.deleteCircularList(0);
        // cll.traverseCircularLinkedList();
        // cll.deleteCircularList(1);
        // cll.traverseCircularLinkedList();
        // cll.delete();
        // cll.traverseCircularLinkedList();

    //     DoublyLinkedList dll = new DoublyLinkedList();
    //     dll.insertInDoublyLinkedList(1, 0);
    //     dll.insertInDoublyLinkedList(2, 1);
    //     dll.insertInDoublyLinkedList(3, 2);
    //     dll.insertInDoublyLinkedList(4, 3);
    //     dll.insertInDoublyLinkedList(5, 4);
    // //     System.out.println(dll.head.value);
    // //     System.out.println(dll.head.next.value);
    // //     System.out.println(dll.head.next.next.value);
    // //     System.out.println(dll.head.next.next.next.value);
    // //     System.out.println(dll.head.next.next.next.next.value);
    //      dll.traverseDoublyLinkedList();   
    //      dll.reverseTraversalInDoublyLinkedList();
    //     System.out.println(dll.searchInDoublyLinkedList(8));
    //     System.out.println(dll.searchInDoublyLinkedList(4));
    //     dll.insertInDoublyLinkedList(8, 0);
    //     dll.insertInDoublyLinkedList(9, 1);
    //     dll.traverseDoublyLinkedList();
    //     System.out.println(dll.searchInDoublyLinkedList(8));
    //     dll.deleteFromDoublyLinkedList(7);
    //     dll.traverseDoublyLinkedList();
    //     dll.deleteFromDoublyLinkedList(4);
    //     dll.traverseDoublyLinkedList();
    //     dll.delete();
    //     dll.traverseDoublyLinkedList();
        

    CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
    // cdll.createCirculaDoublyLinkedList(1);
    // System.out.println(cdll.head.value);
    cdll.insertInCircularDoublyLinkedList(10, 0);
    cdll.insertInCircularDoublyLinkedList(20, 1);
    cdll.insertInCircularDoublyLinkedList(30, 2);
    cdll.insertInCircularDoublyLinkedList(40, 3);
    cdll.insertInCircularDoublyLinkedList(50, 1);
    // System.out.println(cdll.head.value);
    // System.out.println(cdll.head.next.value);
    // System.out.println(cdll.head.next.next.value);
    // System.out.println(cdll.head.next.next.next.value); 
    // System.out.println(cdll.head.next.next.next.next.value);
    cdll.traversalInCircularDoublyLinkedList();
    cdll.reverseTraversalInCircularDoublyLinkedList();
    cdll.deleteFromCircularDoublyLinkedList(0);
    cdll.deleteFromCircularDoublyLinkedList(3);
    cdll.traversalInCircularDoublyLinkedList();
}
    
}
