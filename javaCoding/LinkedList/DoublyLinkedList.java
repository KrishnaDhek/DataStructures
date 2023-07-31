package LinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode creDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.next = null;
        node.previous =null;
        node.value = nodeValue;
        head = node;
        tail=node;
        size =1;
        return head;
    }
    //insert method
    
}
