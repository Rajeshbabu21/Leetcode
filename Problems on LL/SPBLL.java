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
public class SPBLL {
    public static Node firstNode(Node head) {
        Node temp = head;
        Map<Node,Integer> NodeList = new HashMap<>();

        while(temp != null){
            if(NodeList.containsKey(temp))
            {
                return temp;
            }
            NodeList.put(temp,1);
            temp = temp.next;
        }

        return null;
    }
}