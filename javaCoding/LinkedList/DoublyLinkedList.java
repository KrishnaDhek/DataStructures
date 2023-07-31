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
    public void insertInDoublyLinkedList(int nodeValue,int location){
        DoublyNode node  = new DoublyNode();
        node.value = nodeValue;

        if(head==null){
            creDoublyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            node.next = head;
            node.previous = null;
            head.previous =node;
            head = node;
        }
        else if(location>=size){
            node.next = null;
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        else{
            DoublyNode temp = head;
            int index=0;
            while(index<location-1){
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            node.previous = temp;
            node.next.previous = node;
            temp.next = node;

        }
        size++;

    }
    
}
