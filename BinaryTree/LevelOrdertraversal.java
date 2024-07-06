package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrdertraversal {

    static class  Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
    public static void nlevel(Node root,int level,int currLevel){
        if(root==null) return;
        if(level==currLevel) {
            System.out.print(root.val+" ");
            return;
        }
        nlevel(root.left, level, currLevel+1);
        nlevel(root.right, level, currLevel+1);
    }

    public static void levelOrder2(Node root){
        Queue<Pair> q=new LinkedList<>();
        if(root!=null) q.add(new Pair(root, 0));
        int prevLevel=0;
        while(q.size()>0){
            Pair front=q.remove();
            Node temp=front.node;
            int lvl=front.level;
            if(lvl!=prevLevel) {
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }
    
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        System.out.print("Lvele Order Traversal");
        levelOrder(a);
        System.out.println();
        System.out.print("at level print : ");
        nlevel(a, 0, 0);

        System.out.println("Level Order Traversal with line :");
        levelOrder2(a);
    }
}
