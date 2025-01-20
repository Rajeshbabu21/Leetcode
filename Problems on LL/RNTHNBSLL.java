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

public class RNTHNBSLL
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node temp = head;
        int count = 0;
        
        while(temp !=null)
        {
            count++;
            temp =temp.next;
        }

        if(count == K)
        {
            head= head.next;
            return head;
        }

        int res = count - K;
         temp = head;
        while(temp != null)
        {
            res--;
            if(res == 0)
            {
                Node del = temp.next;
                temp.next = del.next;
                return head;
            }
            temp = temp.next;
        }

        return null;
    }
}