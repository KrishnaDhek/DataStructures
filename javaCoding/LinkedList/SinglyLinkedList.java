package LinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node  = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return head;
    }

    //insert method 

    public void insertInSinglyLinkedList(int nodeValue, int location){
        Node node  = new Node();
        node.value = nodeValue;

        if(head==null){
            createSinglyLinkedList(nodeValue);
            return;
        }
       
        //insert at first place
       else if(location==0){
            node.next = head;
            head = node;
            size++;

        }
        //insert at last
        else if(location>=size){
            node.next = null;
            tail.next =node;
            tail = node; 
        }

        //insert at any location
        else{
            Node temp = head;
            int index = 0;
            while(index<location-1){
                temp =temp.next;
                index++;
            }

            node.next = temp.next;
            temp.next = node;
            
        }
        size++;
    }
    //traversal method
    public void traversalInSinglyLinkedList(){
        if(head==null){
            System.out.println("Singly linked list does not contain any element! ");
            
        }

        Node temp = head;
        int i=0;
        while(temp!=null){
            System.out.print(temp.value);
            temp = temp.next;
           if(i!=size-1)
            System.out.print("->"); 
            i++;
        
        }
        System.out.println(" ");
        
        
    }
    
}
