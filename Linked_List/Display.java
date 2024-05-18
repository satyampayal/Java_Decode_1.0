package Linked_List;

public class Display {
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        
        Node a=new Node(10);
        Node b=new Node(20);
        a.next=b;
        Node c=new Node(30);
        b.next=c;
        Node d=new Node(40);
        c.next=d;
        Node e=new Node(50);
        d.next=e;


        // shallow copy
        Node temp=a;
       print(temp);
    }
}
