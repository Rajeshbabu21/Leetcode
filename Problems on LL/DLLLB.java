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


public class DLLLB {

    public static boolean detectCycle(Node head) {

        
        Map<Node,Integer> NodeList = new HashMap<>();

        Node temp = head;

        while(temp != null)
        {
            if(NodeList.containsKey(temp))
            {
                return true;
            }

            NodeList.put(temp,1);
            temp = temp.next;
        }

        return false;
        
    }
}