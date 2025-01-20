import java.util.*;

public class SEOODB {
    public static Node oddEvenList(Node head) {
        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Arrays to store odd and even indexed node data
        ArrayList<Integer> oddData = new ArrayList<>();
        ArrayList<Integer> evenData = new ArrayList<>();

        Node temp = head;
        int index = 1;

        // Traverse the list and store data in respective arrays
        while (temp != null) {
            if (index % 2 != 0) {
                oddData.add(temp.data);  // Odd-indexed nodes
            } else {
                evenData.add(temp.data); // Even-indexed nodes
            }
            temp = temp.next;
            index++;
        }

        // Reassign data to nodes (odd data first, then even data)
        temp = head;
        index = 0;  // Reset the index for assigning back data
        
        // Assign odd nodes first
        while (temp != null && index < oddData.size()) {
            temp.data = oddData.get(index);
            temp = temp.next;
            index++;
        }

        // Assign even nodes after odd ones
        index = 0;  // Reset the index for even data
        while (temp != null && index < evenData.size()) {
            temp.data = evenData.get(index);
            temp = temp.next;
            index++;
        }

        return head;
    }
}
