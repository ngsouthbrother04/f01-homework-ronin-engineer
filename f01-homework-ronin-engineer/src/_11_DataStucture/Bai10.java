package _11_DataStucture;

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFront(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delFront() {
        if (head == null) {
            System.out.println("Danh sách trống.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void delLast() {
        if (tail == null) {
            System.out.println("Danh sách trống.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void showFront() {
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void showBack() {
        DoubleNode current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Bai10 {
    public static void main(String[] args) {
        DoubleLinkedList dlk = new DoubleLinkedList();

        dlk.addFront(10);
        dlk.addLast(20);
        dlk.addLast(30);

        System.out.print("Danh sach tu dau -> cuoi: ");
        dlk.showFront();

        System.out.print("Danh sach tu cuoi -> dau: ");
        dlk.showBack();

        dlk.delFront(); dlk.delLast();

        System.out.print("Danh sach sau khi xoa: ");
        dlk.showFront();
    }
}