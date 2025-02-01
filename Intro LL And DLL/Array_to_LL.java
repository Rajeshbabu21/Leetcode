// Array to Linked List
class Node {

    int data;

    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Array_to_LL {

    public static void main(String[] args) {


        int arr[] = {100, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Node head = new Node(arr[0], null);


        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i], null);

            mover.next = temp;

            mover = temp;
        }

        System.out.println(head.data);
    }
}