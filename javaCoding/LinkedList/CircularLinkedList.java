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
    public void insertInCircularSinglyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        //if head is null then create method is called
        if(head==null){
            createCircularSinglyLinkedList(nodeValue);
            return;
        }
        //insert at begining
       else if(location==0){
            node.next = head;
            head = node;
        }

        //insertion at last
       else if(location>=size){
            node.next = head;
            tail.next = node;
            tail = node;
        }

        //insertion at any location
        else{
            Node temp = head;
            int index = 0;

            while(index<location-1){
                temp = temp.next;
                index++;
            }

            node.next = temp.next;
            temp.next =node;
        }
        size++;
    }
    
}
