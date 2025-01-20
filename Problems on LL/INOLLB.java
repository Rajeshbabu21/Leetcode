public /****************************************************************

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


public class INOLLB {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Map<Node,Integer> hashmap = new HashMap<>();

        Node temp =  firstHead;

        while(temp != null)
        {
            hashmap.put(temp,1);
            temp = temp.next;
        }

        temp = secondHead;

        while(temp != null)
        {
            if(hashmap.containsKey(temp))
            {
                return temp.data;
            }

            temp = temp.next;
        }

        return -1;
    }
} {
 
}
