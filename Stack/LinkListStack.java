package Stack;

class Node{
    int next;
    int val;
    Node(int val){
        this.val=val;
    }
}
class StackByLL{
    Node head=null;
    int size=0;
    
    void push(int x){
        Node temp=new Node(x);
       // temp.next=head;
        head=temp;
    }
}
public class LinkListStack {
    
}
