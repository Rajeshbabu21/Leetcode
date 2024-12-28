class Node {
    int data;
    Node next;

    // Constructor for a node with a given value and next pointer
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor for a node with a given value and null next pointer
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DTLL {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Print the linked list
        printLinkedList(head);
    }

    // Function to convert an array to a linked list
    public static Node arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Return null for an empty array
        }

        // Initialize the head node
        Node head = new Node(arr[0]);
        Node temp = head;

        // Iterate through the array and create new nodes
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next; // Move to the next node
        }

        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null"); // End of the linked list
    }
}
