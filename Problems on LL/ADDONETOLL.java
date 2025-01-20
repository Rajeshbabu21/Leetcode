import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class ADDONETOLL {

	public static Node reverse(Node head)
	{
		Node temp = head;
		Node prev = null;
		Node front = head;
		while(temp != null)
		{
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}

		return prev;
	}
	public static Node addOne(Node head) {
		// Write your code here.
		 head   = reverse(head);
		int carry = 1;
		Node temp = head;
		int sum = 0;
		int rem;

		while(temp != null)
		{
			sum = carry + temp.data;
			rem = sum %10;

			temp.data  = rem;
			carry = sum /10;

			temp = temp.next;

		}

		if(carry > 0)
		{
			head = reverse(head);
			Node nn = new Node(carry);
			nn.next = head;
			return nn;
		}

		head = reverse(head);
		return head;
	}
}