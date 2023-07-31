package LinkedList;

public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //create Node
    public  DoublyNode createCirculaDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.next = node;
        head = node;
        node.previous =node;
        tail = node;
        node.value = nodeValue;
        size =1;
        return head;
    }

    //inseert method
    public void insertInCircularDoublyLinkedList(int nodeValue, int location){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;

        if(head==null){
            createCirculaDoublyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            node.next= head;
            head.previous = node;
            node.previous = tail;
            tail.next = node;
            head = node;
        }
        else if(location>=size){
           node.next = head;
           head.previous = node;
           tail.next = node;
           node.previous = tail;
           tail = node;

        }
        else{
            DoublyNode temp = head;
            int index =0;
            while(index<location-1){
                temp = temp.next;
                index++;
            }

            node.next = temp.next;
            node.previous = temp;
            temp.next = node;
            node.next.previous = node;
        }
        size++;
    }

    //traverse method

    public void traversalInCircularDoublyLinkedList(){
        if(head==null){
            System.out.println("Circular Doubly Linked List is Empty!");
            return;
        }
        else{
            DoublyNode temp =head;
           for(int i =0; i<size; i++){
            System.out.print(temp.value);
                if(i!=size-1)
                System.out.print("->");
                temp = temp.next;
           }
           System.out.println("\n");
        }
    }

    //reverse method
     public void reverseTraversalInCircularDoublyLinkedList(){
        if(head==null) {
            System.out.println("Circular Doubly Linked List is Empty! ");
        }

        else{
            DoublyNode temp = tail;
            for(int i =0 ;i <size; i++){
                System.out.print(temp.value);
                if(i!=size-1)
                    System.out.print("<-");
                    temp = temp.previous;
            }
            System.out.println("\n");
        }
     }
     //search method
     public boolean search(int nodeValue){
        DoublyNode temp = head;
        while(temp.next!=head){
            if(temp.value==nodeValue){
                return true;
            }
            temp = temp.next;
        }
        return false;

     }

     //delete node
     public void deleteFromCircularDoublyLinkedList(int location){
        DoublyNode temp = head;
        if(head==null){
            System.out.println("Circular Doubly Linked List is Empty!");
            return;
        }
        else if(location==0){
           if(size==1){
            head.next =null;
            head.previous = null;
            tail =null;
            size--;
           }
           else{
            head = head.next;
            head.previous = tail;
            tail.next = head;
            size--;
           }
        }
        else if(location>=size){
            if(size==1){
                head.next=null;
                head.previous=null;
                head=null;
                tail=null;
                size--;
            }
            else{
                tail = tail.previous;
                tail.next=head;
                head.previous=tail;
                size--;
            }
        }
        else{
            DoublyNode tmep =head;
            for(int i=0;i<location-1;i++){
                temp = temp.next;

            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;

        }

     }
     
    
    
}
