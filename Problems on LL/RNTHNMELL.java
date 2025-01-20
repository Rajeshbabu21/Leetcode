/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class RNTHNMELL
{
    public static Node reverse(Node head)
    {
        Node back = null;
        Node temp = head;
        Node front = temp;
        while(temp != null)
        {
            front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        return back;
    }

    public static Node removeKthNode(Node head, int K)
    {
        Node newhead = reverse(head);
        int count = 1;  
        Node temp = newhead;

        if(newhead == null || newhead.next == null)
        {
            return null;
        }

        if(K == 1) 
        {
            newhead = newhead.next;
            if (newhead != null) {
                newhead.prev = null;  
            }
            return reverse(newhead);
        }

        Node prev = null;
        while(temp != null)
        {
            if(count == K) 
            {
                if (prev != null) {
                    prev.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = prev;  
                }
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        
        return reverse(newhead);
    }
}
