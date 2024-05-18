package Linked_List;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;

    }
}

public class Lect1 {

    public static void main(String[] args) {
     Node a=new Node(10) ;
     System.out.println(a);
     System.out.println(a.val);
     Node b=new Node(10) ;
     // linking a to b
     a.next=b;
     System.out.println(b.next);
     System.out.println(b);
     System.out.println(a.next);


    }
}
