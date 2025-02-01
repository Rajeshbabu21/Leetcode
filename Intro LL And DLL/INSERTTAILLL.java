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

public class INSERTTAILLL {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Insert a new node at the head with value 18
        head = Inserttail(head, 18);  // Pass the data value 18

        // Print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // Function to insert a new node at the head of the linked list
    public static Node Inserttail(Node head, int data) {

        Node temp = head;

        if(head == null)
        {
            return new Node(data,null);
        }

        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node nn = new Node(data, null); 
        nn.next = null;
        temp.next = nn;
        
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
