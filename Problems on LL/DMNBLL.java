/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class DMNBLL {
    public static Node deleteMiddle(Node head) {
        // Write your code here.

        if(head == null || head.next == null)
        {
            return null;
        }



        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        int res = ((int)count/2) + 1;
        Node prev = head;
        temp = head;

        while(temp != null){
            res--;
            if(res == 0)
            {
                Node front = temp.next;
                prev.next = front;

            }
            prev = temp;
            temp = temp.next;

        }
     

        return head;
    }
}