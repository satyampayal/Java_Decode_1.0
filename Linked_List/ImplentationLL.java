package Linked_List;

class SinglyLL {
    Node head;
    Node tail;
    int size = 0;

    void addLast(int val) {
        Node a = new Node(val);
        size++;
        if (tail == null) {
            head = a;
            tail = a;
            return;
        }
        tail.next = a;
        tail = a;
    }

    void add(int val) {
        Node a = new Node(val);
        size++;
        if (head == null) {
            head = a;
            tail = a;
            return;
        }
        a.next = head;
        head = a;

    }

    void insert(int indx, int val) {
        if (indx > size) {
            System.out.println("Not perform postion should be less then its size");
            return;
        }
        if (indx == 1) {
            add(val);
            return;
        }
        Node a = new Node(val);
        size++;
        Node currNode = head;
        Node nextnode = currNode;
        while (indx != 1) {
            currNode = nextnode;
            nextnode = currNode.next;
            indx--;
        }
        a.next = nextnode;
        currNode.next = a;
    }

    int get(int indx) {
        if (indx < 1) {
            System.out.println("Indx start from 1 ");
            return -1;
        }
        if (indx > size) {
            System.out.println("Out of boundary");
            return -1;
        }
        Node temp = head;
        while (indx != 1) {
            temp = temp.next;
            indx--;
        }
        return temp.val;
    }

    void set(int indx, int val) {
        if (indx < 1) {
            System.out.println("Indx start from 1 ");
            return;
        }
        if (indx > size) {
            System.out.println("Out of boundary");
            return;
        }
        Node temp = head;
        while (indx != 1) {
            temp = temp.next;
            indx--;
        }
        temp.val = val;
    }

    void deletLast() {
        if (size < 1) {
            return;
        }
        if (size == 1) {
            head = null;
            size--;
            return;
        }
        Node temp = head.next;
        Node prevNode = head;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;

        }
        prevNode.next = null;
        temp = null;
        size--;
    }

    void deletFirst() {
        if (size < 1) {
            return;
        }
        if (size == 1) {
            head = null;
            size--;

            return;
        }
        Node temp = head.next;
        size--;

        head = temp;

    }

    void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}

public class ImplentationLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        // add in front
        list.add(10);
        list.add(20);
        list.add(30);
        // add in last
        list.addLast(40);
        // add at any index
        list.insert(3, 11);
        // dispaly LL
        list.display();
        // display size
        // System.out.println(list.size);
        // get element at any index
        System.out.println(list.get(8));
        // set at any index
        list.set(111, 0);
        list.display();
        // delet node from last
        System.out.println("Delete from last");
        list.deletLast();
        list.display();
        // delet node from front
        System.out.println("Delete from First");
        list.deletFirst();
        // list.display();

        // list.deletFirst();
        // list.display();

        // list.deletFirst();
        // list.display();

        // list.deletFirst();
        // list.display();

        // list.deletFirst();
        list.display();

    }

}
