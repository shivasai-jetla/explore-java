package Concept;

public class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Constructor to initialize the LinkedList
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Node not found");
        } else {
            current.next = current.next.next;
        }
    }

    // Method to display the LinkedList
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the LinkedList
        list.display(); // Output: 10 -> 20 -> 30 -> null

        // Remove an element
        list.remove(20);

        // Display the LinkedList again
        list.display(); // Output: 10 -> 30 -> null
    }
}
