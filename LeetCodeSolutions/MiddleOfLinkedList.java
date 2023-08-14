package LeetCodeSolutions;

// LeetCode 876 Middle of the LinkedList
// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.





class LinkedList{
    Node head;
    class Node{
        Node next;
        int val;
        Node(int value){
            val = value;
            next = null;
        }

    }

    public Node push(int value){
        Node node = new Node(value);
        node.next =head;
        head = node;
        return head;
    }

    public int mid(){
        return this.MidOfList().val;
    }

    private Node MidOfList(){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public  void print(){

        Node  temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Main{
        public static void main(String[] args) {
            LinkedList l = new LinkedList();
            l.push(1);
            l.push(2);
            l.push(3);
            l.push(4);
            l.push(5);
            l.push(6);
            l.push(7);
            l.push(8);
            l.print();
            System.out.println(l.mid());
        }
}
