package LinkedList;

public class CircularLinkedList {
    Node head; 
    Node tail;
    int size;

    //create CircularLinkedList
    //circular singly linked list has pointer to the head node from tail node

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
            size++;
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

            //get the index of location after which new node is to be added
            while(index<location-1){
                temp = temp.next;
                index++;
            }

            //first update the next of the node that is created, so that we don not lose the track of the list
            node.next = temp.next;
            temp.next =node;
        }
        size++;
    }
    
    //traversal method

    public void traverseCircularLinkedList(){
        if(head==null){
            System.out.println("Circular list does not exist");
            return;
        }
        else{
             Node temp = head;
            for(int i=0;i<size; i++){
                System.out.print(temp.value);
        
             if(i!= size-1){
             System.out.print("->");
           }
            temp = temp.next;

            }

        }
        System.out.println("\n");
    }
       //search method
       public boolean searchInCircularSinglyLinkedList(int nodeValue){
       Node temp = head;
      do{
        if(temp.value == nodeValue)
        return true;
        temp = temp.next;
       }while(temp!=head);
       return false;
    }
    public void deleteCircularList(int location){
        if(head==null){
            System.out.println("Circular does not exist");
            return;
        }
        else if(location==0){
            head = head.next;
            tail.next = head;
            size--;

            if(size==0){
                tail = null;
                head.next =null;
                head = null;
            }

        }
        else if(location>=size){
            Node temp = head;
            int index =0;

            for(int i =0; i<size-1;i++){
                temp = temp.next;
            }
            if(temp == head){
                head.next = null;
                tail = head = null;
               size--;
                return;

            }
            temp.next = head;
            tail = temp;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0; i<location-1; i++){
                temp =temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    //delete entire
    public void delete(){
        head =null;
        tail =null;
        System.out.println("Successfully deleted circular linked list");
    }
}


