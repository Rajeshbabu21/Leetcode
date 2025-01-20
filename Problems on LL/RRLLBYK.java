public /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


public ListNode findl(ListNode temp, int k)
{
    int cnt= 1;
    while(temp != null)
    {
        if(cnt == k)
        {
           break; 
        }

        cnt++;
        temp = temp.next;
    }
    return temp;
}
    public ListNode rotateRight(ListNode head, int k) {

        ListNode tail = head;
        int len = 1;

        if(head == null || head.next == null || k == 0 )
        {
            return head;
        }

        while(tail.next != null)
        {
            len ++;
            tail = tail.next;
        }

        if(k % len ==0)
        {
            return head;
        }

        k = k % len;

        tail.next = head;
        ListNode nnew = findl(head,len-k);

        head = nnew.next;
        nnew.next = null;

        return head;

        

        
    }
} {
 
}
