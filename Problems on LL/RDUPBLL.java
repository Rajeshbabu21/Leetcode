/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        Node temp = head;
        
        while(temp != null && temp.next != null) {
            // If the current node's data is the same as the next node's data, skip the next node
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                // Move to the next node if no duplicate
                temp = temp.next;
            }
        }

        return head;
    }
}
