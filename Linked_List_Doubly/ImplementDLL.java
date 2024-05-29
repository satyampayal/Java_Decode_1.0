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
        size++;
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
        size++;
        return;
    }
    tail.next=a;
    a.prev=tail;
    tail=a;
    size++;
   }
   // add at any indx
   public void add(int val,int indx){
    if(indx>size|| indx<0 ){
        System.out.println("Not possible  bound problem");
        return ;
    }
    if(indx==1){
        addFront(val);
        return;
    }
    if(indx==size){
        addLast(val);
        return;
    }
    Node a=new Node(val);

    Node temp=head;
    while(indx!=1){
        temp=temp.next;
        indx--;
    }
    a.prev=temp.prev;
    temp.prev.next=a;
    temp.prev=a;
    a.next=temp;
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

   // size of List
   public void getSize(){
    System.out.println("size of List is: "+size);
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
        // size of list
        list.getSize();
        // add at any indx
        list.add(60,4);
        list.printFordward();


    }
    
}
