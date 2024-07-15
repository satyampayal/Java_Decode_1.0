package HashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
     class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
    
        }

    }
public class TopView {

    public static void printTopView(Node root){
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));
        int minLevel=Integer.MAX_VALUE;
        int maxLevel=Integer.MIN_VALUE;
        while (q.size()>0) {
            Pair front=q.remove();
            Node n=front.node;
            int lvl=front.level;
            minLevel=Math.min(minLevel, lvl);
            maxLevel=Math.max(maxLevel, lvl);
            if(!map.containsKey(lvl)) map.put(lvl,n.val);
            if(n.left!=null) q.add(new Pair(n.left,lvl-1));
            if(n.right!=null) q.add(new Pair(n.right,lvl+1));
            
        }
        for(int i=minLevel;i<=maxLevel;i++){
            System.out.print(map.get(i)+" ");
        }

    }
    public static void main(String[] args) {

    }
}
