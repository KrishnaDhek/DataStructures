package LinkedList;

public class CircularLinkedList {
    Node head; 
    Node tail;
    int size;

    //create CircularLinkedList

    public Node createCircularSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next =head;
        node.value = nodeValue;
        head = node;
        tail =node;
        size =1;
        return head;
    }
    
    //insertion in circular singly linked lsit

    
}
