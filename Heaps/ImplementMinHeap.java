package Heaps;

public class ImplementMinHeap {
   static  class MinHeap{
        int size;
        int[] arr;
        MinHeap(int capacity){
            arr=new int[capacity];
            size=0;
        }
        public void add(int ele){
            if(size==0) arr[0]=ele;
            else{
                arr[size]=ele;
                // upheapify
                int c=size;
                
                while(c!=0){
                    int p=(c-1)/2;
                    if(arr[p]>arr[c]) {
                        int temp=arr[p];
                        arr[p]=arr[c];
                        arr[c]=temp;
                        c=p;
                    }
                    else{
                        break;
                    }
                }
            }
            size++;
            return;
        }
        public int remove() throws Exception{
           if(size==0)  throw new Exception("heap is Empty ");
           int peek= arr[0];
           // swap
           int temp=peek;
           arr[0]=arr[size-1];
           arr[size-1]=peek;
           // decrese size
           size--;
           // down heapify
           int p=0;
           while(p<size){
            int lc=2*p+1;
            int rc=2*p+2;
            if(lc>=size ) break;
            if(rc>=size ) break;
            int minIdx=p;
            if(arr[minIdx]>arr[lc]) {minIdx=lc; }
            if(arr[minIdx]>arr[rc]) {minIdx=rc; }
            if(p==minIdx)  break;
            // swap
            temp=arr[minIdx];
            arr[minIdx]=arr[p];
            arr[p]=temp;
            p=minIdx;


           }
           return peek;

        }
        public int peek() throws Exception{
            if(size==0) throw new Exception("Heap is Empty");
            return arr[0];
        }
        public void print(){
            if(size==0) {
                System.out.println("Heap is Empty"); 
                return ;
            }
            else{
                int t=0;
                while(t<size){
                    System.out.print(arr[t]+" ");
                    t++;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        MinHeap hp=new MinHeap(10);
        hp.add(1);
        hp.add(3);
        hp.add(7);
        hp.add(10);
        hp.add(14);
        hp.add(20);
        hp.add(25);
        hp.add(13);
        hp.add(2);
        hp.add(0);
        
        hp.print();
        hp.remove();
        hp.print();

    }
}
