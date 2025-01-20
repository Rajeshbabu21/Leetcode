/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class RNTHNOPTLL {
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> ao = new ArrayList<>();
        ArrayList<Integer> ae = new ArrayList<>();
        int index = 1;
        ListNode temp = head;
        while(temp != null)
        {

        
        if(index %2 != 0)
        {
            ao.add(temp.val);
        }
        else{
            ae.add(temp.val);
        }
        index++;
        temp = temp.next;
        }

        index = 0;
        temp =head;

        while(temp != null &&  index < ao.size())
        {
            temp.val = ao.get(index);
            index ++;
            temp = temp.next;
        }

        index = 0;
        while(temp != null &&  index < ae.size())
        {
            temp.val = ae.get(index);
            index ++;
            temp = temp.next;

        }

        return head;






        
    }
}