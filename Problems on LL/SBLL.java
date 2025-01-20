import java.util.* ;
import java.io.*; 
/*************************************************************

	Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/
import java.util.*;
public class SBLL {
	public static Node sortLL(Node head) {
		// Write your code here.
		Node temp = head;
		ArrayList<Integer> number = new ArrayList<>();

		while(temp != null)
		{
			number.add(temp.data);
			temp = temp.next;

		}

		Collections.sort(number);
		temp = head;
		int i = 0;
		int n = number.size();
		while(temp != null && i < n)
		{
			temp.data = number.get(i);
			i++;
			temp = temp.next;
		}

		return head;
		
	}
}