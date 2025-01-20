package DLL;

class Node {
    int data;
    Node next;
    Node back;

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class ArrayToDLL {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert the array to a doubly linked list
        Node head = Arraytodll(arr);

        // Print the doubly linked list
        System.out.println(head.data);
    }

    public static Node Arraytodll(int arr[]) {
        // First node as the head and their pointers
        Node head = new Node(arr[0]);
        Node prev = head;

        // Loop through the array and create a doubly linked list
        for (int i = 1; i < arr.length; i++) {

            // creating the new node untill the last
            Node temp = new Node(arr[i]);

            // to remember the previous node
            prev.next = temp;


            // temp'back is the previous node
            temp.back = prev;
            prev = temp;
        }

        return head;
    }

}
