
// Program to demonstrate basic linked list operations

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class LinkedListExample {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List:");
        list.display();
    }
}
