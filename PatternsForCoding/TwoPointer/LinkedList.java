package PatternsForCoding.TwoPointer;

class Node{
        int data;
        Node next;
    
    Node(int val){
        this.data = val;
        this.next =null;
    }
}

class LinkedList{
    Node head;

    public void append(int data){
        Node node = new Node(data);
        if(head==null){
            head= node;
            return;
        }

        Node cNode = head;
        while(cNode.next!=null){
            cNode = cNode.next;
        }
        cNode.next = node;
    }
// createLoop method introduces a loop in the linked list.
    public void createLoop(int position){
        Node temp = head;
        // It first goes to the node at the given position. This node will be the start of our loop.
        for(int i=0;i<position;i++){
            if(temp==null){
                return;
            }
            temp = temp.next;
        }
        Node temp1 = head;
        // Then, it traverses to the last node of the list.
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
// Finally, it sets the next of the last node to the node at the given position, thus creating a loop.
        temp1.next = temp;
    }

    public boolean detectLoop(){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                System.out.println("Loop Detected");
                return true;
            }
        }
        return false;
    }

    public void printList() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    
    if (detectLoop()) {
        System.out.println("Loop detected! Cannot print the entire list without going into an infinite loop.");
        return;
    }

    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(9);
        list.createLoop(2);
        list.printList();
        list.detectLoop();

    }


}