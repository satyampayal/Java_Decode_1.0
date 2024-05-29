package Linked_List_Doubly;

class DLL{
   Node head=null;
   Node tail=null;
   int size=0;
   public void addFront(int val){
    Node a=new Node(val);
    if(head==null){
        head=a;
        tail=a;
        return;
    }
    head.prev=a;
    a.next=head;
    head=a;
    size++;
   }
   public void addLast(int val){
    Node a=new Node(val);
    if(head==null){
        head=a;
        tail=a;
        return;
    }
    tail.next=a;
    a.prev=tail;
    tail=a;
    size++;
   }
   public void getLast(){
    if(tail==null){
        System.out.println("List is empty");
        return;
    }
    System.out.println("Last Value of list is: "+tail.val);
   }
   public void getFirst(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    System.out.println("First Value of list is: "+head.val);
   }

   // display element forward
   public  void printFordward(){
    if(size==0){
        return ;
    }
    System.out.println("Forward Display");
        Node temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.val+" ");
            temp1 = temp1.next;
        }
        System.out.println();
}
}

public class ImplementDLL {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);
        list.addFront(40);
        // get element at last
     //   list.getLast();
        // add in last
        list.addLast(50);
        list.printFordward();
        list.getLast();


    }
    
}
