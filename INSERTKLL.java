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

public class INSERTKLL {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Insert a new node at the head with value 18
        head = Insertk(head, 2);  // Pass the data value 18

        // Print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // Function to insert a new node at the head of the linked list
    public static Node Insertk(Node head, int k) {

        Node temp = head;

        if(head == null)
        {
            if(k ==1)
            {

                return new Node(19,null);
            }
        }

        if(k ==1)
        {
            Node nn = new Node(19,null);
            nn.next = head;
            return nn;
        }

        // temp = head; 
        int count = 0;

        while(temp.next != null)
        {
            count++;
            if(count == k-1)
            {
                Node nn = new Node(19,null);
                nn.next = temp.next;
                temp.next = nn;



            }

            temp = temp.next;
        }

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
