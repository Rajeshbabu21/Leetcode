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
 }

 *****************************************************************/
import java.util.*;
public class PNLLB {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while(temp != null)
        {
            s.push(temp.data);
            temp = temp.next;
        }

         temp = head;
        while(temp !=null)
        {
            int el = s.pop();
            if(temp.data != el )
            {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}