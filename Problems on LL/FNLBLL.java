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
import java.util.*;
public class FNLBLL
{
    public static int lengthOfLoop(Node head) {
        Node temp = head;
        int count = 0;
        Map<Node,Integer> NodeMap = new HashMap<>();
        while(temp != null)
        {

            if(NodeMap.containsKey(temp))
            {
                Node dum = temp;
                temp =  temp.next;
                count =1;
                while(temp != dum)
                {
                    count = count + 1;
                    temp = temp.next;
                    
                }
                return count;

            }
            NodeMap.put(temp,1);
            temp = temp.next;

        }

        return 0;
        
    }
}