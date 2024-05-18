package Linked_List;

 class SinglyLL{
    Node head;
    Node tail;
    int size=0;

      void addLast(int val){
        Node a=new Node(val);
        size++;
        if(tail==null){
            head=a;
            tail=a;
            return;
        }
        tail.next=a;
        tail=a;
    }
     void add(int val){
        Node a=new Node(val);
        size++;
        if(head==null){
            head=a;
            tail=a;
            return;
        }
        a.next=head;
        head=a;

    }
     void display(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp =temp.next;
        }
        System.out.println();

    }
}

public class ImplentationLL {
   public static void main(String[] args) {
    SinglyLL list=new SinglyLL();
    list.add(10);
    list.add(20);
    list.add(30);
    list.addLast(40);
    list.display();
    System.out.println(list.size);
   }

    

 

}
