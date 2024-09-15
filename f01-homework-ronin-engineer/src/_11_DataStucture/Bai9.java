package _11_DataStucture;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int x) {
        Node newNode = new Node(x);

        if(head == null) head = newNode;
        else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void del(int val) {
        if(head == null) return;
        if(head.data == val) {
            head = head.next; return;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data != val) {
            curr = curr.next;
        }

        //Tim duoc gia tri
        if(curr.next != null) curr.next = curr.next.next;
    }

    public void showList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Bai9 {
    public static void main(String[] args) {
        SinglyLinkedList lk = new SinglyLinkedList();

        for(int i = 1; i <= 8; ++i) lk.add(i);

        lk.showList();

        lk.del(4);

        lk.showList();
    }
}