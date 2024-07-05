package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public static void preOrder(Node a,List<Integer> l){
        if(a==null) return ;

        l.add(a.val);
        preOrder(a.left, l);
        preOrder(a.right, l);
    }
    public static boolean smTree(Node a,Node h){
      List<Integer> l1=new ArrayList<>();
      List<Integer> l2=new ArrayList<>();
     preOrder( a,l1);
     preOrder( h,l2);
      return l1.equals(l2);

     

    }
 public static void main(String[] args) {
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);
    Node g=new Node(7);

    a.left=b;
    a.right=c;
    b.left=d;
    b.right=e;
    c.left=f;
    c.right=g; 

    Node h=new Node(1);
    Node i=new Node(2);
    Node j=new Node(3);
    Node k=new Node(4);
    Node l=new Node(5);
    Node m=new Node(6);
    Node n=new Node(7);

    h.left=i;
    h.right=j;
    i.left=k;
    i.right=l;
    j.left=m;
    j.right=n; 
    System.out.println(smTree(a, h));

 }   
}
