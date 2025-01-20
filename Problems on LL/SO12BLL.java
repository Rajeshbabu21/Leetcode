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

public class SO12BLL
{
    public static Node sortList(Node head) {
        // Write your code here
        // ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        Node temp = head;
        while(temp != null)
        {
            if(temp.data == 0)
            {
                zero.add(temp.data);
            }
            else if(temp.data == 1)
            {
                one.add(temp.data);
            }

            else{
                two.add(temp.data);
            }
            temp = temp.next;
        }

        temp = head;
        int i = 0;

        int s0 = zero.size();
        int s1 = one.size();
        int s2 = two.size();

        while(temp != null && i<s0)
        {
            temp.data = zero.get(i);
            i++;
            temp = temp.next;
        }

        i=0;
        while(temp != null && i < s1)
        {
            temp.data = one.get(i);
            i++;
            temp = temp.next;

        }

        i = 0 ;
        while(temp != null && i< s2)
        {
            temp.data = two.get(i);
            i++;
            temp = temp.next;
        }

        return head;

    }
}