package Concept;

public class UserLinkedList {

    static class Node {

        //Node declaration
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {

        //Node Initialization
        Node newNode = new Node(data);

        //Assigning Node to head
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            //Looping for null because we assign address at null of next node to link both
            while (temp.next != null) {
                temp = temp.next;
            }
            //Assigning address of new node in previous node next
            temp.next = newNode;
        }
    }

    public void display() {

        //If head is null print linkedlist is empty
        if (head == null) {
            System.out.println("Linkedlist is empty");
        }


        else{

            //Assigning head to temp
            Node temp = head;

            //Traverse temp throughout the linkedlist to show data
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next; //It navigates to next mode
            }
            System.out.println("Null");
        }
    }

    public void delete(int data)
    {
        if(head == null)
        {
            System.out.println("LinkedList is empty");
        }

        //if the data is head, delete head
        else if(head.data == data)
        {
            head = head.next;
            System.out.println("Element "+data+" deleted");
        }

        else {
            // Assigning head to temp because it is the starting point of list
            Node temp = head;

            //Looping
            while (temp.next.data != data) {
                temp = temp.next;
            }
            System.out.println("Element "+data+" deleted");
            temp.next = temp.next.next;
        }


    }



    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();
        list.delete(30);
        list.display();
        list.delete(20);
        list.display();
        list.delete(10);
        list.display();
        list.delete(50);
        list.display();
    }
}
