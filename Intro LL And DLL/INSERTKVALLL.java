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

public class INSERTKVALLL {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Insert a new node with value 19 after the first occurrence of value 2
        head = Insertk(head, 2);  // The data value to insert after

        // Print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // Function to insert a new node with value 19 after the first occurrence of the given data
    public static Node Insertk(Node head, int data) {
        Node temp = head;

        // Handle the case where the list is empty
        if (head == null) {
            return new Node(19, null); // Insert 19 in an empty list
        }

        // Traverse the list to find the node with the matching data
        while (temp != null) {
            if (temp.data == data) {
                // Insert the new node after the node with the matching data
                Node nn = new Node(19, temp.next); // Create new node with data 19
                temp.next = nn; // Link the new node to the list
                return head; // Return the head of the list (unchanged)
            }
            temp = temp.next; // Move to the next node
        }

        // If data not found, return the original head
        return head;
    }

    // Function to convert an array to a linked list
    public static Node arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Return null if the array is empty
        }

        Node head = new Node(arr[0], null); // Create the head node
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i], null); // Link new nodes
            mover = mover.next;
        }

        return head; // Return the head of the linked list
    }
}


