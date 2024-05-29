package Linked_List_Doubly;

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}


public class Intro {
    public static void printFordward(Node head){
        System.out.println("Forward Display");
            Node temp1 = head;
            while (temp1 != null) {
                System.out.print(temp1.val+" ");
                temp1 = temp1.next;
            }
            System.out.println();
    }
    public static void printBackward(Node tail){
        System.out.println("Backward Display");

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        a.prev = null;

        Node b = new Node(20);
        a.next = b;
        b.prev = a;
        Node c = new Node(30);
        b.next = c;
        c.prev = b;
        Node d = new Node(40);
        c.next = d;
        d.prev = c;
       // display forward
       printFordward(a);
       printBackward(d);
      
    }

}
